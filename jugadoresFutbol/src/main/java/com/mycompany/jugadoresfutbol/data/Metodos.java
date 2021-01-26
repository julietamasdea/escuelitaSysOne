package com.mycompany.jugadoresfutbol.data;



import com.mycompany.jugadoresfutbol.domain.Equipo;
import com.mycompany.jugadoresfutbol.domain.Equipo_Jugador;
import com.mycompany.jugadoresfutbol.domain.Jugador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Metodos {
    public Metodos() {
    }

    public int cantidadDefensoresEquipo (Equipo equipo) {
        int contador = 0;
        LocalDate fechaHoy = LocalDate.now();
        List<Jugador> jugadores  = equipo.getJugadores();
        for (Jugador j:jugadores) {
            List<Equipo_Jugador> historial = j.getHistoriaJugador();
            for (Equipo_Jugador historia:historial) {
                if (historia.estaEntreFechas(fechaHoy)) {
                    if (("defensor").equals(historia.getPosicionCancha().toLowerCase())
                    && ((equipo.getNombre().toLowerCase()).equals(historia.getNombreEquipo().toLowerCase()))) {
                        contador++;
                        break;
                    }
                }
            }
        }
        return contador;
    }

    public int cantidadJugadoresEnFecha(LocalDate fecha, Equipo equipo) {
        if (fecha == null) {
            fecha = LocalDate.now();
        }
        int contador = 0;
        List<Jugador> jugadores = equipo.getJugadores();
        for (Jugador j:jugadores) {
            List<Equipo_Jugador> historial = j.getHistoriaJugador();
            for (Equipo_Jugador historia:historial) {
                if (historia.estaEntreFechas(fecha) && (equipo.getNombre().toLowerCase().equals(historia.getNombreEquipo().toLowerCase()))) {
                    contador++;
                    break;
                }
            }
        }

        return contador;
    }
}
