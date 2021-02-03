package com.mycompany.jugadoresfutbol.data.implementation;



import com.mycompany.jugadoresfutbol.domain.Equipo;
import com.mycompany.jugadoresfutbol.domain.Equipo_Jugador;
import com.mycompany.jugadoresfutbol.domain.Jugador;
import com.mycompany.jugadoresfutbol.dto.EquipoDto;
import com.mycompany.jugadoresfutbol.dto.Equipo_JugadorDto;
import com.mycompany.jugadoresfutbol.dto.JugadorDto;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GeneracionDatos {
    public Map<String, EquipoDto> equipos;

    public GeneracionDatos() {
        equipos = new TreeMap();
        generacionDatos();
    }

    public void generacionDatos() {
        EquipoDto equipoUno    = new EquipoDto("Boca");
        EquipoDto equipoDos    = new EquipoDto("River");
        EquipoDto equipoTres   = new EquipoDto("Estudiantes");

        List<JugadorDto> jugadoresUno  = equipoUno.getJugadores();
        List<JugadorDto> jugadoresDos  = equipoDos.getJugadores();
        List<JugadorDto> jugadoresTres = equipoTres.getJugadores();

        jugadoresUno.add(new JugadorDto("Pablo", "Mendez",(Arrays.asList(
                new Equipo_JugadorDto
                        (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Boca","defensor"),
                new Equipo_JugadorDto
                        (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","defensor"),
                new Equipo_JugadorDto
                        (LocalDate.of(2017,11,12),null,"River","arquero")))));

        jugadoresUno.add(new JugadorDto("Maria", "Lopez",(Arrays.asList(
                new Equipo_JugadorDto
                    (LocalDate.of(2020,01,10),LocalDate.of(2021,01,11),"Boca","defensor"),
                new Equipo_JugadorDto
                        (LocalDate.of(2020,01,10),LocalDate.of(2022,01,11),"Estudiantes","defensor")))));

        jugadoresUno.add(new JugadorDto("Martin", "Perez",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2002,10,23),LocalDate.of(2015,02,11),"Boca","defensor"),
                new Equipo_JugadorDto
                        (LocalDate.of(2019,10,23),null,"Gimnasia","defensor")))));

        jugadoresUno.add(new JugadorDto("Julieta", "Rica",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2012,06,10),LocalDate.of(2017,02,11),"Boca","arquero"),
                new Equipo_JugadorDto
                        (LocalDate.of(2019,10,23),LocalDate.of(2019,11,11),"Estudiantes","defensor"),
                new Equipo_JugadorDto
                        (LocalDate.of(2019,12,23),null,"River","arquero")))));

        jugadoresUno.add(new JugadorDto("Leila", "Gomez",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2017,03,15),null,"Boca","arquero")))));

        jugadoresUno.add(new JugadorDto("Juan", "Lei",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2008,07,13),null,"river","arquero"),
                new Equipo_JugadorDto
                        (LocalDate.of(2019,10,07),LocalDate.of(2012,07,12),"Boca","arquero")))));

        jugadoresUno.add(new JugadorDto("Domingo", "Jerez",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Boca","defensor"),
                new Equipo_JugadorDto
                        (LocalDate.of(2008,03,29),null,"velez","defensor")))));





        jugadoresDos.add(new JugadorDto("Julieta", "Rica",(Arrays.asList(
                new Equipo_JugadorDto
                        (LocalDate.of(2012,06,10),LocalDate.of(2017,02,11),"Boca","arquero"),
                new Equipo_JugadorDto
                        (LocalDate.of(2019,10,23),LocalDate.of(2019,11,11),"Estudiantes","defensor"),
                new Equipo_JugadorDto
                        (LocalDate.of(2019,12,23),null,"River","arquero")))));

        jugadoresDos.add(new JugadorDto("Juan", "Lei",(Arrays.asList(
                new Equipo_JugadorDto
                        (LocalDate.of(2008,07,13),null,"river","arquero"),
                new Equipo_JugadorDto
                        (LocalDate.of(2019,10,07),LocalDate.of(2012,07,12),"Boca","arquero")))));

        jugadoresDos.add(new JugadorDto("Pablo", "Mendez",(Arrays.asList(
                new Equipo_JugadorDto
                        (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Boca","defensor"),
                new Equipo_JugadorDto
                        (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","defensor"),
                new Equipo_JugadorDto
                        (LocalDate.of(2017,11,12),null,"River","arquero")))));

        jugadoresDos.add(new JugadorDto("Maria", "Lopez",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2011,10,23),null,"River","defensor")))));

        jugadoresDos.add(new JugadorDto("Martin", "Perez",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","defensor"),
                new Equipo_JugadorDto
                        (LocalDate.of(2015,03,29),null,"velez","defensor")))));

        jugadoresDos.add(new JugadorDto("Julieta", "Rica",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","defensor")))));

        jugadoresDos.add(new JugadorDto("Leila", "Gomez",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","defensor")))));

        jugadoresDos.add(new JugadorDto("Juan", "Lei",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"River","arquero")))));

        jugadoresDos.add(new JugadorDto("Domingo", "Jerez",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2012,10,23),null,"River","defensor")))));



        jugadoresTres.add(new JugadorDto("Julieta", "Rica",(Arrays.asList(
                new Equipo_JugadorDto
                        (LocalDate.of(2012,06,10),LocalDate.of(2017,02,11),"Boca","arquero"),
                new Equipo_JugadorDto
                        (LocalDate.of(2019,10,23),LocalDate.of(2019,11,11),"Estudiantes","defensor"),
                new Equipo_JugadorDto
                        (LocalDate.of(2019,12,23),null,"River","arquero")))));

        jugadoresTres.add(new JugadorDto("Maria", "Lopez",(Arrays.asList(
                new Equipo_JugadorDto
                        (LocalDate.of(2020,01,10),LocalDate.of(2021,01,11),"Boca","defensor"),
                new Equipo_JugadorDto
                        (LocalDate.of(2020,01,10),LocalDate.of(2022,01,11),"Estudiantes","defensor")))));

        jugadoresTres.add(new JugadorDto("Pablo", "Mendez",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Estudiantes","defensor")))));

        jugadoresTres.add(new JugadorDto("Maria", "Lopez",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2012,10,23),null,"Estudiantes","arquero")))));

        jugadoresTres.add(new JugadorDto("Martin", "Perez",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Estudiantes","arquero")))));

        jugadoresTres.add(new JugadorDto("Julieta", "Rica",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Estudiantes","arquero")))));

        jugadoresTres.add(new JugadorDto("Domingo", "Jerez",(Arrays.asList(
                new Equipo_JugadorDto
                (LocalDate.of(2012,10,23),LocalDate.of(2015,02,11),"Estudiantes","arquero")))));

        equipoUno.setJugadores(jugadoresUno);
        equipoDos.setJugadores(jugadoresDos);
        equipoTres.setJugadores(jugadoresTres);

        equipos.put(equipoUno.getNombre(), equipoUno);
        equipos.put(equipoDos.getNombre(), equipoDos);
        equipos.put(equipoTres.getNombre(), equipoTres);
    }

}
