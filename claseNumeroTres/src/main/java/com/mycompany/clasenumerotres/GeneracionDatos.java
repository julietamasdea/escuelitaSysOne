package com.mycompany.clasenumerotres;

import com.mycompany.clasenumerotres.domain.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GeneracionDatos {
    public List<Barco> barcos;
    public List<Alquiler> alquileres;


    public void creacionAlquileres() {
        alquileres = new ArrayList<>();
        this.alquileres.add(new Alquiler("Maria",31726335,12,barcos.get(0),LocalDate.of(2020,01,12),LocalDate.of(2020,01,23)));
        this.alquileres.add(new Alquiler("Laura",31624832,2,barcos.get(1),LocalDate.of(2020,03,12),LocalDate.of(2020,03,23)));
        this.alquileres.add(new Alquiler("Miguel",27472234,14,barcos.get(2),LocalDate.of(2020,05,12),LocalDate.of(2020,05,23)));
        this.alquileres.add(new Alquiler("Gabriela",12984922,52,barcos.get(3),LocalDate.of(2020,05,12),LocalDate.of(2020,05,23)));
        this.alquileres.add(new Alquiler("Maira",32917523,63,barcos.get(4),LocalDate.of(2020,05,12),LocalDate.of(2020,05,23)));
        this.alquileres.add(new Alquiler("Lourdes",9123878,25,barcos.get(5),LocalDate.of(2020,9,12),LocalDate.of(2020,9,23)));
        this.alquileres.add(new Alquiler("Martin",11294173,75,barcos.get(6),LocalDate.of(2020,12,12),LocalDate.of(2020,12,23)));
        this.alquileres.add(new Alquiler("Juan",32184058,23,barcos.get(7),LocalDate.of(2020,01,12),LocalDate.of(2020,01,23)));
        this.alquileres.add(new Alquiler("Leandro",12758298,25,barcos.get(8),LocalDate.of(2020,02,12),LocalDate.of(2020,02,23)));
        this.alquileres.add(new Alquiler("Alejandro",12892718,75,barcos.get(9),LocalDate.of(2020,02,12),LocalDate.of(2020,02,23)));
        }

    public void creacionBarcos() {
        barcos = new ArrayList<>();
        this.barcos.add(new Deportivo(12371,12, LocalDate.of(2020, 05,12),2));
        this.barcos.add(new Deportivo(22372,4,LocalDate.of(2020, 02,12),4));
        this.barcos.add(new Deportivo(32373,5,LocalDate.of(2019, 01,12),2));
        this.barcos.add(new Deportivo(42374,11,LocalDate.of(2018, 10,12),3));
        this.barcos.add(new Velero(52375,11,LocalDate.of(2015, 10,12),5));
        this.barcos.add(new Velero(62376,2,LocalDate.of(2018, 10,27),7));
        this.barcos.add(new Velero(72377,1,LocalDate.of(2012, 12,11),1));
        this.barcos.add(new Yate(82378,11,LocalDate.of(2018, 10,12),3,1));
        this.barcos.add(new Yate(92379,11,LocalDate.of(2020, 11,01),6,2));
        this.barcos.add(new Yate(02370,11,LocalDate.of(2012, 9,15),7,2));
    }

//Constructors
    public GeneracionDatos() {
    }

//Getters y setters
    public List<Barco> getBarcos() {
        return barcos;
    }

    public void setBarcos(List<Barco> barcos) {
        this.barcos = barcos;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }
}
