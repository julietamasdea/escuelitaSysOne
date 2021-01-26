package com.mycompany.jugadoresfutbol.data;



import com.mycompany.jugadoresfutbol.domain.Equipo;
import com.mycompany.jugadoresfutbol.domain.Equipo_Jugador;
import com.mycompany.jugadoresfutbol.domain.Jugador;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GeneracionDatos {
    public Map<String,Equipo> equipos;

    public GeneracionDatos() {
        equipos = new TreeMap();
        generacionDatos();
    }

    public void generacionDatos() {
        Equipo equipoUno    = new Equipo("Boca");
        Equipo equipoDos    = new Equipo("River");
        Equipo equipoTres   = new Equipo("Estudiantes");

        List<Jugador> jugadoresUno  = equipoUno.getJugadores();
        List<Jugador> jugadoresDos  = equipoDos.getJugadores();
        List<Jugador> jugadoresTres = equipoTres.getJugadores();

        jugadoresUno.add(new Jugador("Pablo", "Mendez",(Arrays.asList(
                new Equipo_Jugador
                        (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Boca","defensor"),
                new Equipo_Jugador
                        (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","defensor"),
                new Equipo_Jugador
                        (LocalDate.of(2017,11,12),null,"River","arquero")))));

        jugadoresUno.add(new Jugador("Maria", "Lopez",(Arrays.asList(
                new Equipo_Jugador
                    (LocalDate.of(2020,01,10),LocalDate.of(2021,01,11),"Boca","defensor"),
                new Equipo_Jugador
                        (LocalDate.of(2020,01,10),LocalDate.of(2022,01,11),"Estudiantes","defensor")))));

        jugadoresUno.add(new Jugador("Martin", "Perez",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2002,10,23),LocalDate.of(2015,02,11),"Boca","defensor"),
                new Equipo_Jugador
                        (LocalDate.of(2019,10,23),null,"Gimnasia","defensor")))));

        jugadoresUno.add(new Jugador("Julieta", "Rica",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2012,06,10),LocalDate.of(2017,02,11),"Boca","arquero"),
                new Equipo_Jugador
                        (LocalDate.of(2019,10,23),LocalDate.of(2019,11,11),"Estudiantes","defensor"),
                new Equipo_Jugador
                        (LocalDate.of(2019,12,23),null,"River","arquero")))));

        jugadoresUno.add(new Jugador("Leila", "Gomez",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2017,03,15),null,"Boca","arquero")))));

        jugadoresUno.add(new Jugador("Juan", "Lei",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2008,07,13),null,"river","arquero"),
                new Equipo_Jugador
                        (LocalDate.of(2019,10,07),LocalDate.of(2012,07,12),"Boca","arquero")))));

        jugadoresUno.add(new Jugador("Domingo", "Jerez",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Boca","defensor"),
                new Equipo_Jugador
                        (LocalDate.of(2008,03,29),null,"velez","defensor")))));





        jugadoresDos.add(new Jugador("Julieta", "Rica",(Arrays.asList(
                new Equipo_Jugador
                        (LocalDate.of(2012,06,10),LocalDate.of(2017,02,11),"Boca","arquero"),
                new Equipo_Jugador
                        (LocalDate.of(2019,10,23),LocalDate.of(2019,11,11),"Estudiantes","defensor"),
                new Equipo_Jugador
                        (LocalDate.of(2019,12,23),null,"River","arquero")))));

        jugadoresDos.add(new Jugador("Juan", "Lei",(Arrays.asList(
                new Equipo_Jugador
                        (LocalDate.of(2008,07,13),null,"river","arquero"),
                new Equipo_Jugador
                        (LocalDate.of(2019,10,07),LocalDate.of(2012,07,12),"Boca","arquero")))));

        jugadoresDos.add(new Jugador("Pablo", "Mendez",(Arrays.asList(
                new Equipo_Jugador
                        (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Boca","defensor"),
                new Equipo_Jugador
                        (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","defensor"),
                new Equipo_Jugador
                        (LocalDate.of(2017,11,12),null,"River","arquero")))));

        jugadoresDos.add(new Jugador("Maria", "Lopez",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2011,10,23),null,"River","defensor")))));

        jugadoresDos.add(new Jugador("Martin", "Perez",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","defensor"),
                new Equipo_Jugador
                        (LocalDate.of(2015,03,29),null,"velez","defensor")))));

        jugadoresDos.add(new Jugador("Julieta", "Rica",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","defensor")))));

        jugadoresDos.add(new Jugador("Leila", "Gomez",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","defensor")))));

        jugadoresDos.add(new Jugador("Juan", "Lei",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","arquero")))));

        jugadoresDos.add(new Jugador("Domingo", "Jerez",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2012,10,23),null,"River","defensor")))));



        jugadoresTres.add(new Jugador("Julieta", "Rica",(Arrays.asList(
                new Equipo_Jugador
                        (LocalDate.of(2012,06,10),LocalDate.of(2017,02,11),"Boca","arquero"),
                new Equipo_Jugador
                        (LocalDate.of(2019,10,23),LocalDate.of(2019,11,11),"Estudiantes","defensor"),
                new Equipo_Jugador
                        (LocalDate.of(2019,12,23),null,"River","arquero")))));

        jugadoresTres.add(new Jugador("Maria", "Lopez",(Arrays.asList(
                new Equipo_Jugador
                        (LocalDate.of(2020,01,10),LocalDate.of(2021,01,11),"Boca","defensor"),
                new Equipo_Jugador
                        (LocalDate.of(2020,01,10),LocalDate.of(2022,01,11),"Estudiantes","defensor")))));

        jugadoresTres.add(new Jugador("Pablo", "Mendez",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Estudiantes","defensor")))));

        jugadoresTres.add(new Jugador("Maria", "Lopez",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2012,10,23),null,"Estudiantes","arquero")))));

        jugadoresTres.add(new Jugador("Martin", "Perez",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Estudiantes","arquero")))));

        jugadoresTres.add(new Jugador("Julieta", "Rica",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Estudiantes","arquero")))));

        jugadoresTres.add(new Jugador("Domingo", "Jerez",(Arrays.asList(
                new Equipo_Jugador
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Estudiantes","arquero")))));

        equipoUno.setJugadores(jugadoresUno);
        equipoDos.setJugadores(jugadoresDos);
        equipoTres.setJugadores(jugadoresTres);

        equipos.put(equipoUno.getNombre(), equipoUno);
        equipos.put(equipoDos.getNombre(), equipoDos);
        equipos.put(equipoTres.getNombre(), equipoTres);
    }

}
