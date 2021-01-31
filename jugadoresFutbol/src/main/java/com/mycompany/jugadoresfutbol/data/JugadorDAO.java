package com.mycompany.jugadoresfutbol.data;

import com.mycompany.jugadoresfutbol.domain.Jugador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JugadorDAO implements IJugadorDAO{
    private static final String SQL_SELECT      = "SELECT dni, nombre, apellido FROM jugadoresfutbol.jugador";
    private static final String SQL_INSERT      = "INSERT INTO jugadoresfutbol.jugador(dni, nombre, apellido) VALUES(?, ?, ?)";
    private static final String SQL_UPDATE      = "UPDATE jugadoresfutbol.jugador SET dni = ?, nombre = ?, apellido = ? WHERE dni = ?";
    private static final String SQL_DELETE      = "DELETE FROM jugadoresfutbol.jugador WHERE dni = ?";

    private static final String DNI            = "dni";
    private static final String NOMBRE         = "nombre";
    private static final String APELLIDO       = "apellido";

    public JugadorDAO() {
    }

    @Override
    public int update(Jugador jugador) {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int registros           = 0;

        try {
            conn = ConexionDB.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, jugador.getDni());
            stmt.setString(2, jugador.getNombre());
            stmt.setString(3, jugador.getApellido());
            stmt.setInt(4, jugador.getDni());
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
    public int insert(Jugador jugador) {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int registros           = 0;
        try {
            conn = ConexionDB.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, jugador.getDni());
            stmt.setString(2, jugador.getNombre());
            stmt.setString(3, jugador.getApellido());
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
    public List<Jugador> select() {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        ResultSet rs;
        Jugador jugador;
        List<Jugador> jugadores    = new ArrayList<>();
        String nombre;
        String apellido;

        try {
            conn = ConexionDB.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs   = stmt.executeQuery();
            while(rs.next()) {
                int dni     = rs.getInt(DNI);
                nombre      = rs.getString(NOMBRE);
                apellido    = rs.getString(APELLIDO);
                jugador     = new Jugador(dni, nombre, apellido);
                jugadores.add(jugador);
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
        return jugadores;
    }

    @Override
    public int delete(Jugador jugador) {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int registros = 0;

        try {
            conn = ConexionDB.getConnection();
            stmt    = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, jugador.getDni());
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
