package com.mycompany.clasenumerocinco.test;

import com.mycompany.clasenumerocinco.data.GeneracionDatos;
import com.mycompany.clasenumerocinco.data.Metodos;

public class Main {
    public static void main(String[] args) {
        GeneracionDatos generacionDatos = new GeneracionDatos();
        Metodos metodos = new Metodos();
        for (String i : generacionDatos.equipos.keySet()) {
            System.out.println("Equipo: " + i + ", cantidad jugadores: " + generacionDatos.equipos.get(i).size()
            + ", defensores: " + metodos.cantidadDefensoresEquipo(generacionDatos.equipos.get(i)));

        }
    }
}
