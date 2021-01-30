package com.mycompany.jugadoresfutbol.data;

import com.mycompany.jugadoresfutbol.domain.Jugador;

import java.util.List;

public interface IJugadorDAO {
    int update(Jugador personaDTO);
    int insert(Jugador personaDTO);
    List<Jugador> select();
    int delete(Jugador personaDTO);
}
