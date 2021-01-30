package com.mycompany.jugadoresfutbol.data;

import com.mycompany.jugadoresfutbol.domain.Equipo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EquipoDAO implements IEquipoDAO {
    private static final String SQL_SELECT      = "SELECT cuit, nombre, categoria FROM jugadoresfutbol.equipo";
    private static final String SQL_SELECT_ID   = "SELECT cuit, nombre, categoria FROM jugadoresfutbol.equipo WHERE cuit = ?";
    private static final String SQL_INSERT      = "INSERT INTO jugadoresfutbol.equipo(cuit, nombre, categoria) VALUES(?, ?, ?)";
    private static final String SQL_UPDATE      = "UPDATE jugadoresfutbol.equipo SET cuit = ?, nombre = ?, categoria = ? WHERE cuit = ?";
    private static final String SQL_DELETE      = "DELETE FROM jugadoresfutbol.equipo WHERE cuit = ?";

    private static final String CUIT            = "cuit";
    private static final String NOMBRE          = "nombre";
    private static final String CATEGORIA       = "categoria";

    public EquipoDAO() {
    }

    @Override
    public int update(Equipo equipo) {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int registros           = 0;

        try {
            conn = ConexionDB.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, equipo.getCuit());
            stmt.setString(2, equipo.getNombre());
            stmt.setString(3, equipo.getCategoriaActual());
            stmt.setInt(4, equipo.getCuit());
            registros = stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                ConexionDB.closeConnection(stmt);
                ConexionDB.closeConnection(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return registros;
    }

    @Override
    public int insert(Equipo equipo) {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int registros           = 0;
        try {
            conn = ConexionDB.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, equipo.getCuit());
            stmt.setString(2, equipo.getNombre());
            stmt.setString(3, equipo.getCategoriaActual());
            registros = stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                ConexionDB.closeConnection(stmt);
                ConexionDB.closeConnection(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return registros;
    }

    @Override
    public List<Equipo> select(int cuit) {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        ResultSet rs            = null;
        List<Equipo> equipos    = new ArrayList<>();

        String nombre;
        String categoria;

        try {
            conn = ConexionDB.getConnection();
            if (int != null) {
                stmt.setInt(1, cuit);
                stmt = conn.prepareStatement(SQL_SELECT_ID);
            } else {
                stmt = conn.prepareStatement(SQL_SELECT);
            }
            rs   = stmt.executeQuery();
            while(rs.next()) {
                int cuit         = rs.getInt(CUIT);
                String nombre    = rs.getInt(NOMBRE);
                String categoria = rs.getInt(CATEGORIA);
                equipo = new Equipo(cuit, nombre, categoria);
                equipos.add(equipo);
            }
            stmt.setInt(1, equipo.getCuit());
            stmt.setString(2, equipo.getNombre());
            stmt.setString(3, equipo.getCategoriaActual());
            stmt.setInt(4, equipo.getCuit());

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                ConexionDB.closeConnection(stmt);
                ConexionDB.closeConnection(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return registros;
    }
    }

    @Override
    public int delete(Equipo equipo) {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int registros = 0;

        try {
            conn    = this.conexionTransaccional != null ? this.conexionTransaccional : ConexionDB.getConnection();
            stmt    = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, equipo.getCuit());
            registros = stmt.executeUpdate();
            return registros;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try {
                ConexionDB.closeConnection(stmt);
                if (this.conexionTransaccional == null) {
                    ConexionDB.closeConnection(conn);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return registros;
    }
}
