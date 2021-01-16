package com.mycompany.clasenumerotres;

import com.mycompany.clasenumerotres.domain.Calculos;

public class main {
    public static void main(String[] args) {
        //Simulacion de carga de datos (creacion de los arrays de Barco y Alquiler
        GeneracionDatos generacionDatos = new GeneracionDatos();
        generacionDatos.creacionBarcos();
        generacionDatos.creacionAlquileres();

        Calculos calculos = new Calculos();

        //Muestra de datos calculados
        System.out.println("Alquiler mayor: " + calculos.mayorAlquiler(generacionDatos.getAlquileres()));
        System.out.println("");
        System.out.println("Alquiler menor: " + calculos.menorAlquiler(generacionDatos.getAlquileres()));
        System.out.println("");
        System.out.println("Promedios mensuales: "); calculos.promedioMensual(generacionDatos.getAlquileres());
        System.out.println("");
        System.out.println("Promedio anual: " + calculos.promedioAnual(generacionDatos.getAlquileres()));
    }
}
