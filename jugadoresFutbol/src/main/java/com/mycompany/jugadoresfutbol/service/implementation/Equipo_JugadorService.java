package com.mycompany.jugadoresfutbol.service.implementation;

import com.mycompany.jugadoresfutbol.domain.Equipo_Jugador;
import com.mycompany.jugadoresfutbol.dto.Equipo_JugadorDto;

import java.util.ArrayList;
import java.util.List;

public class Equipo_JugadorService {

    public Equipo_Jugador convertDto(Equipo_JugadorDto equipoJugadorDto) {
        Equipo_Jugador equipoJugador = new Equipo_Jugador();
        equipoJugador.setCuitEquipo(equipoJugadorDto.getCuitEquipo());
        equipoJugador.setDniJugador(equipoJugadorDto.getDniJugador());
        equipoJugador.setNombreEquipo(equipoJugadorDto.getNombreEquipo());
        equipoJugador.setFecha_inicio(equipoJugadorDto.getFecha_inicio());
        equipoJugador.setFecha_fin(equipoJugadorDto.getFecha_inicio());
        equipoJugador.setPosicionCancha(equipoJugadorDto.getPosicionCancha());

        return equipoJugador;
    }
    public List<Equipo_Jugador> convertDto(List<Equipo_JugadorDto> equiposJugadorDto) {
        List<Equipo_Jugador> equiposJugadores = new ArrayList<>();
        for (Equipo_JugadorDto equipoJugadorDto:equiposJugadorDto ) {
            equiposJugadores.add(convertDto(equipoJugadorDto));
        }
        return equiposJugadores;
    }

    public Equipo_JugadorDto convertModel(Equipo_Jugador equipoJugador) {
        Equipo_JugadorDto equipoJugadorDto = new Equipo_JugadorDto();
        equipoJugadorDto.setCuitEquipo(equipoJugador.getCuitEquipo());
        equipoJugadorDto.setDniJugador(equipoJugador.getDniJugador());
        equipoJugadorDto.setNombreEquipo(equipoJugador.getNombreEquipo());
        equipoJugadorDto.setFecha_inicio(equipoJugador.getFecha_inicio());
        equipoJugadorDto.setFecha_fin(equipoJugador.getFecha_inicio());
        equipoJugadorDto.setPosicionCancha(equipoJugador.getPosicionCancha());

        return equipoJugadorDto;
    }

    public List<Equipo_JugadorDto> convertModel(List<Equipo_Jugador> equiposJugador) {
        List<Equipo_JugadorDto> equiposJugadoresDto = new ArrayList<>();
        for (Equipo_Jugador equipoJugador:equiposJugador ) {
            equiposJugadoresDto.add(convertModel(equipoJugador));
        }
        return equiposJugadoresDto;
    }

}
