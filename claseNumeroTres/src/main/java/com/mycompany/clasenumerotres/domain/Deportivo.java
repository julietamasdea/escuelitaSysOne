package com.mycompany.clasenumerotres.domain;

import java.time.LocalDate;

public class Deportivo extends Barco {
    private int potenciaCV;

    //Calculo de valor del modulo. Suma la potencia al metodo de la clase Barco
    public int calculoModulo() {
        return super.calculoModulo() + potenciaCV;
    }

//Constructors
    public Deportivo() {
    }

    public Deportivo(int matricula, int eslora, LocalDate anioFabricacion, int potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

//Getters y setters
    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
}
