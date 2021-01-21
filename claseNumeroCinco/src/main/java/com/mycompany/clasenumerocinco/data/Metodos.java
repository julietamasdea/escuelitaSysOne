package com.mycompany.clasenumerocinco.data;

import com.mycompany.clasenumerocinco.domain.Jugador;

import java.util.List;

public class Metodos {
    public Metodos() {
    }

    public int cantidadDefensoresEquipo (List<Jugador> jugadores) {
        int contador = 0;
        for (Jugador j:jugadores) {
            if (j.getPosicionCancha().toLowerCase() == "defensor") {
                contador++;
            }
        }
        return contador;
    }
}
