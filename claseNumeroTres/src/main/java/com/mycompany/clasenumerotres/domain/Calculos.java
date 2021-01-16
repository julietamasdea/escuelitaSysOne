package com.mycompany.clasenumerotres.domain;

public class Calculos {
    //Procesa todos los alquileres y devuelve el de mayor valor
    public long mayorAlquiler(Alquiler[] alquileres) {
        long mayor = 0;
        for (Alquiler a:alquileres) {
            if (mayor < a.calculoAlquiler()) {
                mayor = a.calculoAlquiler();
            }
        }
        return mayor;
    }

    //Procesa todos los alquileres y devuelve el de menor valor
    public long menorAlquiler(Alquiler[] alquileres) {
        long menor = 99999999;
        for (Alquiler a:alquileres) {
            if (menor > a.calculoAlquiler()) {
                menor = a.calculoAlquiler();
            }
        }
        return menor;
    }

    /* Recorre el arreglo de alquileres, almacena todos los precios en
       el array "promediosMensuales" y en "cantidadAlquileresMensuales"
       la cantidad de alquileres por mes. Luego realiza por cada mes
       la division de los precios por la cantidad
     */
    public void promedioMensual(Alquiler[] alquileres) {
        long[]   promediosMensuales          = {0,0,0,0,0,0,0,0,0,0,0,0};
        int[]    cantidadAlquileresMensuales = {0,0,0,0,0,0,0,0,0,0,0,0};
        String[] meses                       = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int      mes;
        for (Alquiler a:alquileres) {
            mes = a.getFechaInicial().getMonthValue() - 1;
            promediosMensuales[mes] +=  a.calculoAlquiler();
            cantidadAlquileresMensuales[mes] ++;
        }
        for (int i = 0; i < promediosMensuales.length; i++) {
            if (promediosMensuales[i] != 0) {
                System.out.println(meses[i] + ": " +(promediosMensuales[i] / cantidadAlquileresMensuales[i]));
            } else {
                System.out.println(meses[i] + ": 0");
            }
        }
    }

    //Suma todos los precios de todos los alquileres y luego lo divide por el total de alquileres
    public double promedioAnual(Alquiler[] alquileres) {
        int montoTotalAnual = 0;
        for (Alquiler a:alquileres) {
            montoTotalAnual += a.calculoAlquiler();
        }
        return montoTotalAnual/alquileres.length;
    }

//Constructors
    public Calculos() {
    }
}
