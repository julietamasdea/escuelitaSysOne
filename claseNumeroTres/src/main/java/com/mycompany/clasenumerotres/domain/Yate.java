package com.mycompany.clasenumerotres.domain;

import java.time.LocalDate;

public class Yate extends Barco {
    private int potenciaCV;
    private int numeroCamarotes;

    //Calculo de valor del modulo. Suma la potencia y los camarotes al metodo de la clase Barco
    public int calculoModulo() {
        return super.calculoModulo() + potenciaCV + numeroCamarotes;
    }

//Constructors
    public Yate() {
    }

    public Yate(int matricula, int eslora, LocalDate anioFabricacion, int potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV      = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

//Getters y setters
    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
}
