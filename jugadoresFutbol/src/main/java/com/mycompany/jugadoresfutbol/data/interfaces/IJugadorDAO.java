package com.mycompany.jugadoresfutbol.data.interfaces;

import com.mycompany.jugadoresfutbol.domain.Jugador;

import java.util.List;

public interface IJugadorDAO {
    int update(Jugador jugador);
    int insert(Jugador jugador);
    List<Jugador> select();
    int delete(Jugador jugador);
}
