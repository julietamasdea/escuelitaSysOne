package com.mycompany.jugadoresfutbol.data.implementation;

import com.mycompany.jugadoresfutbol.data.ConexionDB;
import com.mycompany.jugadoresfutbol.data.interfaces.IEquipoDAO;
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
    public List<Equipo> select() {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        ResultSet rs;
        Equipo equipo;
        List<Equipo> equipos    = new ArrayList<>();
        String nombre;
        String categoria;

        try {
            conn = ConexionDB.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs   = stmt.executeQuery();
            while(rs.next()) {
                int cuit     = rs.getInt(CUIT);
                nombre       = rs.getString(NOMBRE);
                categoria    = rs.getString(CATEGORIA);
                equipo = new Equipo(cuit, nombre, categoria);
                equipos.add(equipo);
            }

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
        return equipos;
    }

    @Override
    public Equipo select(int cuit) {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        ResultSet rs            = null;
        Equipo equipo           = null;
        String nombre;
        String categoria;

        try {
            conn = ConexionDB.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setInt(1, cuit);
            rs   = stmt.executeQuery();
            while(rs.next()) {
                nombre    = rs.getString(NOMBRE);
                categoria = rs.getString(CATEGORIA);
                equipo = new Equipo(cuit, nombre, categoria);
            }

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
        return equipo;
    }

    @Override
    public int delete(Equipo equipo) {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int registros = 0;

        try {
            conn = ConexionDB.getConnection();
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
                ConexionDB.closeConnection(conn);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return registros;
    }
}
