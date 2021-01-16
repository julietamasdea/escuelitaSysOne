package com.mycompany.clasenumerotres.domain;

import java.time.LocalDate;

public class Velero extends Barco {
    private int numeroMastiles;

    //Calculo de valor del modulo. Suma el numero de mastiles al metodo de la clase Barco
    public int calculoModulo() {
        return super.calculoModulo() + numeroMastiles;
    }

//Constructors
    public Velero() {
    }

    public Velero(int matricula, int eslora, LocalDate anioFabricacion, int numeroMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

//Getters y setters
    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
}
