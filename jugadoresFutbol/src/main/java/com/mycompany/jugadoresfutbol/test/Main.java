package com.mycompany.jugadoresfutbol.test;


import com.mycompany.jugadoresfutbol.data.*;
import com.mycompany.jugadoresfutbol.data.implementation.GeneracionDatos;
import com.mycompany.jugadoresfutbol.domain.*;
import com.mycompany.jugadoresfutbol.service.implementation.EquipoService;
import com.mycompany.jugadoresfutbol.service.interfaces.IEquipoService;
import com.mycompany.jugadoresfutbol.service.interfaces.IEquipo_JugadorService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        GeneracionDatos generacionDatos = new GeneracionDatos();
        EquipoService equipoService = new EquipoService();
        LocalDate fecha = LocalDate.of(2014,05,12);
        for (String i : generacionDatos.equipos.keySet()) {
            equipoService.cantidadJugadoresEnFecha(fecha, generacionDatos.equipos.get(i));
            System.out.println("Equipo: " + i + ", cantidad jugadores en la fecha "
                  + fecha + ": " + equipoService.cantidadJugadoresEnFecha(fecha, generacionDatos.equipos.get(i))
            + ", defensores: " + equipoService.cantidadJugadoresEnFecha(fecha, generacionDatos.equipos.get(i)));

        }


        //conexionBD();
    }
    public static void conexionBD() {
        //equipo ¡¡¡Descomentar para probar!!!
        /*
            Equipo equipo = new Equipo(1488,"River","A");
            Equipo equipo2 = new Equipo(1499,"Boca","A");
            EquipoDAO equipoDAO = new EquipoDAO();
            equipoDAO.insert(equipo);
            equipoDAO.insert(equipo2);
            equipo.setNombre("river");
            equipoDAO.update(equipo);
            Equipo equipo1 = equipoDAO.select(1488);
            List<Equipo> equipos = equipoDAO.select();
            
       */ 

        //jugadores ¡¡¡Descomentar para probar!!!
        /*
        Jugador jugador = new Jugador(39172910, "mariano", "lopez");
        Jugador jugador2 = new Jugador(37172124, "lucia", "mendez");
        JugadorDAO jugadorDAO = new JugadorDAO();
        jugadorDAO.insert(jugador);
        jugadorDAO.insert(jugador2);
        jugador2.setNombre("Pelusa");
        jugadorDAO.update(jugador2);
        List<Jugador> jugadores = jugadorDAO.select();
        */

        //equipo_jugador ¡¡¡Descomentar para probar!!!
/*
        Equipo_Jugador equipojugador = new Equipo_Jugador(39172910,1488,LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","defensor");
        Equipo_Jugador equipojugador2 = new Equipo_Jugador(37172124,1488,LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","defensor");
        Equipo_JugadorDAO equipojugadordao = new Equipo_JugadorDAO();
        equipojugadordao.insert(equipojugador);
        equipojugadordao.insert(equipojugador2);
        List<Equipo_Jugador> equiposjugadores = equipojugadordao.select();
*/
    }
}
