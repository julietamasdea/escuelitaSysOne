package com.mycompany.jugadoresfutbol.data;

import com.mycompany.jugadoresfutbol.domain.Equipo_Jugador;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipo_JugadorDAO implements IEquipo_JugadorDAO {
    private static final String SQL_SELECT      = "SELECT dni_jugador, cuit_equipo, fecha_inicio, fecha_fin, posicion, nombre_equipo FROM jugadoresfutbol.equipo_jugador";
    private static final String SQL_SELECT_ID   = "SELECT dni_jugador, cuit_equipo, fecha_inicio, fecha_fin, posicion, nombre_equipo FROM jugadoresfutbol.equipo_jugador WHERE cuit_equipo = ?";
    private static final String SQL_INSERT      = "INSERT INTO jugadoresfutbol.equipo_jugador(dni_jugador, cuit_equipo, fecha_inicio, fecha_fin, posicion, nombre_equipo) VALUES(?, ?, ?, ?, ?, ?)";

    private static final String DNI_JUGADOR     = "dni_jugador";
    private static final String CUIT_EQUIPO     = "cuit_equipo";
    private static final String FECHA_INICIO    = "fecha_inicio";
    private static final String FECHA_FIN       = "fecha_fin";
    private static final String POSICION        = "posicion";
    private static final String NOMBRE_EQUIPO   = "nombre_equipo";

    public Equipo_JugadorDAO() {
    }

    @Override
    public int insert(Equipo_Jugador equipoJugador) {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        int registros           = 0;
        
        try {
            conn = ConexionDB.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, equipoJugador.getDniJugador());
            stmt.setInt(2, equipoJugador.getCuitEquipo());
            stmt.setDate(3, Date.valueOf(equipoJugador.getFecha_inicio()));
            stmt.setDate(4, Date.valueOf(equipoJugador.getFecha_fin()));
            stmt.setString(5, equipoJugador.getPosicionCancha());
            stmt.setString(6, equipoJugador.getNombreEquipo());
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
    public List<Equipo_Jugador> select() {
        Connection conn         = null;
        PreparedStatement stmt  = null;
        ResultSet rs;
        Equipo_Jugador equipoJugador;
        List<Equipo_Jugador> equiposJugadores  = new ArrayList<>();
        
        int dniJugador;
        int cuitEquipo;
        LocalDate fechaInicio;
        LocalDate fechaFin;
        String nombreEquipo;
        String posicionCancha;

        try {
            conn = ConexionDB.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs   = stmt.executeQuery();
            while(rs.next()) {
                dniJugador      = rs.getInt(DNI_JUGADOR);
                cuitEquipo      = rs.getInt(CUIT_EQUIPO);
                fechaInicio     = rs.getDate(FECHA_INICIO).toLocalDate();
                fechaFin        = rs.getDate(FECHA_FIN).toLocalDate();
                nombreEquipo    = rs.getString(NOMBRE_EQUIPO);
                posicionCancha  = rs.getString(POSICION);
                equipoJugador = new Equipo_Jugador(dniJugador, cuitEquipo, fechaInicio, fechaFin, nombreEquipo, posicionCancha);
                equiposJugadores.add(equipoJugador);
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
        return equiposJugadores;
    }

    @Override
    public Equipo_Jugador select(int cuitEquipo) {
        Connection conn                 = null;
        PreparedStatement stmt          = null;
        ResultSet rs                    = null;
        Equipo_Jugador equipoJugador    = new Equipo_Jugador();

        try {
            conn = ConexionDB.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_ID);
            stmt.setInt(1, cuitEquipo);
            rs   = stmt.executeQuery();
            while(rs.next()) {
                equipoJugador.setDniJugador(rs.getInt(DNI_JUGADOR));
                equipoJugador.setCuitEquipo(rs.getInt(CUIT_EQUIPO));
                equipoJugador.setFecha_fin(rs.getDate(FECHA_INICIO).toLocalDate());
                equipoJugador.setFecha_inicio(rs.getDate(FECHA_FIN).toLocalDate());
                equipoJugador.setPosicionCancha(rs.getString(POSICION));
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
        return equipoJugador;
    }
}
