package com.mycompany.clasenumerotres;

import com.mycompany.clasenumerotres.domain.*;

import java.time.LocalDate;

public class GeneracionDatos {
    public Barco[] barcos;
    public Alquiler[] alquileres;

    public void creacionAlquileres() {
        Alquiler alquilerUno    = new Alquiler("Maria",31726335,12,barcos[0],LocalDate.of(2020,01,12),LocalDate.of(2020,01,23));
        Alquiler alguilerDos    = new Alquiler("Laura",31624832,2,barcos[1],LocalDate.of(2020,03,12),LocalDate.of(2020,03,23));
        Alquiler alguilerTres   = new Alquiler("Miguel",27472234,14,barcos[2],LocalDate.of(2020,05,12),LocalDate.of(2020,05,23));
        Alquiler alguilerCuatro = new Alquiler("Gabriela",12984922,52,barcos[3],LocalDate.of(2020,05,12),LocalDate.of(2020,05,23));
        Alquiler alguilerCinco  = new Alquiler("Maira",32917523,63,barcos[4],LocalDate.of(2020,05,12),LocalDate.of(2020,05,23));
        Alquiler alguilerSeis   = new Alquiler("Lourdes",9123878,25,barcos[5],LocalDate.of(2020,9,12),LocalDate.of(2020,9,23));
        Alquiler alguilerSiete  = new Alquiler("Martin",11294173,75,barcos[6],LocalDate.of(2020,12,12),LocalDate.of(2020,12,23));
        Alquiler alguilerOcho   = new Alquiler("Juan",32184058,23,barcos[7],LocalDate.of(2020,01,12),LocalDate.of(2020,01,23));
        Alquiler alguilerNueve  = new Alquiler("Leandro",12758298,25,barcos[8],LocalDate.of(2020,02,12),LocalDate.of(2020,02,23));
        Alquiler alguilerDiez   = new Alquiler("Alejandro",12892718,75,barcos[9],LocalDate.of(2020,02,12),LocalDate.of(2020,02,23));
        this.alquileres = new Alquiler[]{alquilerUno, alguilerDos, alguilerTres, alguilerCuatro, alguilerCinco, alguilerSeis, alguilerSiete, alguilerOcho, alguilerNueve, alguilerDiez};
    }

    public void creacionBarcos() {
        Barco barcoUno      = new Deportivo(12371,12, LocalDate.of(2020, 05,12),2);
        Barco barcoDos      = new Deportivo(22372,4,LocalDate.of(2020, 02,12),4);
        Barco barcoTres     = new Deportivo(32373,5,LocalDate.of(2019, 01,12),2);
        Barco barcoCuatro   = new Deportivo(42374,11,LocalDate.of(2018, 10,12),3);
        Barco barcoCinco    = new Velero(52375,11,LocalDate.of(2015, 10,12),5);
        Barco barcoSeis     = new Velero(62376,2,LocalDate.of(2018, 10,27),7);
        Barco barcoSiete    = new Velero(72377,1,LocalDate.of(2012, 12,11),1);
        Barco barcoOcho     = new Yate(82378,11,LocalDate.of(2018, 10,12),3,1);
        Barco barcoNueve    = new Yate(92379,11,LocalDate.of(2020, 11,01),6,2);
        Barco barcoDiez     = new Yate(02370,11,LocalDate.of(2012, 9,15),7,2);
        this.barcos = new Barco[]{barcoUno, barcoDos, barcoTres, barcoCuatro, barcoCinco, barcoSeis, barcoSiete, barcoOcho, barcoNueve, barcoDiez};
    }

//Constructors
    public GeneracionDatos() {
    }

//Getters y setters
    public Barco[] getBarcos() {
        return barcos;
    }

    public void setBarcos(Barco[] barcos) {
        this.barcos = barcos;
    }

    public Alquiler[] getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(Alquiler[] alquileres) {
        this.alquileres = alquileres;
    }
}
