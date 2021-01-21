package com.mycompany.clasenumerocinco.data;

import com.mycompany.clasenumerocinco.domain.Equipo;
import com.mycompany.clasenumerocinco.domain.Jugador;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GeneracionDatos {
    public Map<String,List<Jugador>> equipos;

    public GeneracionDatos() {
        equipos = new TreeMap();
        generacionDatos();
    }

    public void generacionDatos() {
        Equipo equipoUno    = new Equipo("River");
        Equipo equipoDos    = new Equipo("Boca");
        Equipo equipoTres   = new Equipo("Estudiantes");

        List<Jugador> jugadoresUno  = equipoUno.getJugadores();
        List<Jugador> jugadoresDos  = equipoDos.getJugadores();
        List<Jugador> jugadoresTres = equipoTres.getJugadores();

        jugadoresUno.add(new Jugador("Pablo", "Mendez","defensor"));
        jugadoresUno.add(new Jugador("Maria", "Lopez","defensor"));
        jugadoresUno.add(new Jugador("Martin", "Perez","defensor"));
        jugadoresUno.add(new Jugador("Julieta", "Rica","arquero"));
        jugadoresUno.add(new Jugador("Leila", "Gomez","arquero"));
        jugadoresUno.add(new Jugador("Juan", "Lei","arquero"));
        jugadoresUno.add(new Jugador("Domingo", "Jerez","defensor"));

        jugadoresDos.add(new Jugador("Maria", "Lopez","defensor"));
        jugadoresDos.add(new Jugador("Martin", "Perez","defensor"));
        jugadoresDos.add(new Jugador("Julieta", "Rica","defensor"));
        jugadoresDos.add(new Jugador("Leila", "Gomez","defensor"));
        jugadoresDos.add(new Jugador("Juan", "Lei","arquero"));
        jugadoresDos.add(new Jugador("Domingo", "Jerez","defensor"));

        jugadoresTres.add(new Jugador("Pablo", "Mendez","defensor"));
        jugadoresTres.add(new Jugador("Maria", "Lopez","arquero"));
        jugadoresTres.add(new Jugador("Martin", "Perez","arquero"));
        jugadoresTres.add(new Jugador("Julieta", "Rica","arquero"));
        jugadoresTres.add(new Jugador("Domingo", "Jerez","arquero"));

        equipoUno.setJugadores(jugadoresUno);
        equipoDos.setJugadores(jugadoresDos);
        equipoTres.setJugadores(jugadoresTres);

        equipos.put(equipoUno.getNombre(), equipoUno.getJugadores());
        equipos.put(equipoDos.getNombre(), equipoDos.getJugadores());
        equipos.put(equipoTres.getNombre(), equipoTres.getJugadores());
    }

}
