package com.mycompany.clasenumerotres.domain;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Alquiler {
    private String nombreCliente;
    private int dniCliente;
    private int posicionAmarre;
    private final int valorFijoAlquiler = 2;
    private Barco barco;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;

    /*
        Calculo de valor del alquiler. Multiplica:
            Diferencia entre fecha final y fecha de inicio
            Modulo del barco
            Valor fijo (constante valorFijoAlquiler)
     */
    public long calculoAlquiler() {
        return ((DAYS.between(this.fechaInicial,this.fechaFinal)+1)*(barco.calculoModulo())*(this.valorFijoAlquiler));
    }
//Constructors
    public Alquiler() {
    }

    public Alquiler(String nombreCliente, int dniCliente, int posicionAmarre, Barco barco, LocalDate fechaInicial, LocalDate fechaFinal) {
        this.nombreCliente  = nombreCliente;
        this.dniCliente     = dniCliente;
        this.posicionAmarre = posicionAmarre;
        this.barco          = barco;
        this.fechaInicial   = fechaInicial;
        this.fechaFinal     = fechaFinal;
    }

//Getters y setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public int getValorFijoAlquiler() {
        return valorFijoAlquiler;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
}
