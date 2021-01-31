package com.mycompany.jugadoresfutbol.data;

import com.mycompany.jugadoresfutbol.domain.Equipo_Jugador;

import java.util.List;

public interface IEquipo_JugadorDAO {
    int insert(Equipo_Jugador equipojugador);
    List<Equipo_Jugador> select();
    Equipo_Jugador select(int cuit);
}
