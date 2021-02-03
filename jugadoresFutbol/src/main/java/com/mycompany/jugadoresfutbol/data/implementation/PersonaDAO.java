package com.mycompany.jugadoresfutbol.data.implementation;

import com.mycompany.jugadoresfutbol.data.ConexionDB;
import com.mycompany.jugadoresfutbol.data.interfaces.IPersonaDAO;
import com.mycompany.jugadoresfutbol.domain.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements IPersonaDAO {
    private static final String SQL_SELECT      = "SELECT dni, nombre, apellido FROM jugadoresfutbol.persona";
    private static final String SQL_INSERT      = "INSERT INTO jugadoresfutbol.persona(dni, nombre, apellido) VALUES(?, ?, ?)";
    private static final String SQL_UPDATE      = "UPDATE jugadoresfutbol.persona SET dni = ?, nombre = ?, apellido = ? WHERE dni = ?";
    private static final String SQL_DELETE      = "DELETE FROM jugadoresfutbol.persona WHERE dni = ?";

    private static final String DNI            = "dni";
    private static final String NOMBRE         = "nombre";
    private static final String APELLIDO       = "apellido";

    public PersonaDAO() {
    }

    @Override
    public int update(Persona persona) {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int registros           = 0;

        try {
            conn = ConexionDB.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, persona.getDni());
            stmt.setString(2, persona.getNombre());
            stmt.setString(3, persona.getApellido());
            stmt.setInt(4, persona.getDni());
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
    public int insert(Persona persona) {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int registros           = 0;
        try {
            conn = ConexionDB.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, persona.getDni());
            stmt.setString(2, persona.getNombre());
            stmt.setString(3, persona.getApellido());
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
    public List<Persona> select() {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        ResultSet rs;
        Persona persona;
        List<Persona> personas    = new ArrayList<>();
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
                persona     = new Persona(dni, nombre, apellido);
                personas.add(persona);
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
        return personas;
    }

    @Override
    public int delete(Persona persona) {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int registros = 0;

        try {
            conn = ConexionDB.getConnection();
            stmt    = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getDni());
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
