package com.mycompany.jugadoresfutbol.dto;

import java.time.LocalDate;

public class Equipo_JugadorDto {
    private int dniJugador;
    private int cuitEquipo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String nombreEquipo;
    private String posicionCancha;

    public Equipo_JugadorDto(LocalDate fechaInicio, LocalDate fechaFin, String nombreEquipo, String posicionCancha) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombreEquipo = nombreEquipo;
        this.posicionCancha = posicionCancha;
    }

    public Equipo_JugadorDto(int dniJugador, int cuitEquipo, LocalDate fechaInicio, LocalDate fechaFin, String nombreEquipo, String posicionCancha) {
        this.dniJugador = dniJugador;
        this.cuitEquipo = cuitEquipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombreEquipo = nombreEquipo;
        this.posicionCancha = posicionCancha;
    }

    public Equipo_JugadorDto() {
    }

    public int getDniJugador() {
        return dniJugador;
    }

    public void setDniJugador(int dniJugador) {
        this.dniJugador = dniJugador;
    }

    public int getCuitEquipo() {
        return cuitEquipo;
    }

    public void setCuitEquipo(int cuitEquipo) {
        this.cuitEquipo = cuitEquipo;
    }

    public LocalDate getFecha_inicio() {
        return fechaInicio;
    }

    public void setFecha_inicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFecha_fin() {
        return fechaFin;
    }

    public void setFecha_fin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPosicionCancha() {
        return posicionCancha;
    }

    public void setPosicionCancha(String posicionCancha) {
        this.posicionCancha = posicionCancha;
    }
}
