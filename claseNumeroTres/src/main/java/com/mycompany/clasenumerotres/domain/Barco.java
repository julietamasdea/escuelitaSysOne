package com.mycompany.clasenumerotres.domain;

import java.time.LocalDate;

public abstract class Barco {
    private int matricula;
    private int eslora;
    private LocalDate anioFabricacion;
    private final int multiplicadorEslora = 10;

    public int calculoModulo() {
        return this.eslora*multiplicadorEslora;
    }

//Constructors
    public Barco() {
    }

    public Barco(int matricula, int eslora, LocalDate anioFabricacion) {
        this.matricula       = matricula;
        this.eslora          = eslora;
        this.anioFabricacion = anioFabricacion;
    }

//Getters y setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(LocalDate anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

}
