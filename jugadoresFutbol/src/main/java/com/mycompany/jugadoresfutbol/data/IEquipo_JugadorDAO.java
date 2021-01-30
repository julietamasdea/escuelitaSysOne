package com.mycompany.jugadoresfutbol.data;

import com.mycompany.jugadoresfutbol.domain.Equipo_Jugador;

import java.util.List;

public interface IEquipo_JugadorDAO {
    int update(Equipo_Jugador personaDTO);
    int insert(Equipo_Jugador personaDTO);
    List<Equipo_Jugador> select();
    int delete(Equipo_Jugador personaDTO);
}
