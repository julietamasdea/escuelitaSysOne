package com.mycompany.jugadoresfutbol.service.interfaces;

import com.mycompany.jugadoresfutbol.domain.Equipo_Jugador;
import com.mycompany.jugadoresfutbol.dto.Equipo_JugadorDto;

import java.util.List;

public interface IEquipo_JugadorService {
    Equipo_Jugador convertDto(Equipo_JugadorDto equipoJugadorDto);
    List<Equipo_Jugador> convertDto(List<Equipo_JugadorDto> equiposJugadorDto);
    Equipo_JugadorDto convertModel(Equipo_Jugador equipoJugador);
    List<Equipo_JugadorDto> convertModel(List<Equipo_Jugador> equiposJugador);
}
