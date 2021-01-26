package com.mycompany.jugadoresfutbol.test;


import com.mycompany.jugadoresfutbol.data.GeneracionDatos;
import com.mycompany.jugadoresfutbol.data.Metodos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        GeneracionDatos generacionDatos = new GeneracionDatos();
        Metodos metodos = new Metodos();
        LocalDate fecha = LocalDate.of(2014,05,12);
        for (String i : generacionDatos.equipos.keySet()) {
            System.out.println("Equipo: " + i + ", cantidad jugadores en la fecha "
                  + fecha + ": " + metodos.cantidadJugadoresEnFecha(fecha, generacionDatos.equipos.get(i))
            + ", defensores: " + metodos.cantidadDefensoresEquipo(generacionDatos.equipos.get(i)));

        }
    }
}
