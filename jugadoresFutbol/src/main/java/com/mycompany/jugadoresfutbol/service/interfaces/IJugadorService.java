package com.mycompany.jugadoresfutbol.service.interfaces;

import com.mycompany.jugadoresfutbol.domain.Jugador;
import com.mycompany.jugadoresfutbol.dto.EquipoDto;
import com.mycompany.jugadoresfutbol.dto.JugadorDto;

import java.time.LocalDate;
import java.util.List;

public interface IJugadorService {
    boolean estaEntreFechas(JugadorDto jugador, LocalDate localdate);
    boolean defensorEnFecha(JugadorDto jugador, LocalDate fecha, EquipoDto equipo);
    List<Jugador> convertDto(List<JugadorDto> jugadoresDto);
    Jugador convertDto(JugadorDto jugadorDto);
    JugadorDto convertModel(Jugador jugador);
    List<JugadorDto> convertModel(List<Jugador> jugadores);
    void agregarJugador(JugadorDto jugadorDto);
    void modificarJugador(JugadorDto jugadorDto);
    List<JugadorDto> seleccionarJugadores();

}
