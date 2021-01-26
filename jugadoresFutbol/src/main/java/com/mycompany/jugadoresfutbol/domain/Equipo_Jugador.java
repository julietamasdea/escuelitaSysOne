package com.mycompany.jugadoresfutbol.domain;

import java.time.LocalDate;

public class Equipo_Jugador {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String nombreEquipo;
    private String posicionCancha;

    public boolean estaEntreFechas(LocalDate fecha) {
        LocalDate fechaFin = LocalDate.now();
        if (this.fechaFin != null) {
            fechaFin = this.fechaFin;
        }
        if (fecha != null) {
            if (fecha.isAfter(fechaInicio.minusDays(1)) && fecha.isBefore(fechaFin.plusDays(1))) {
                return true;
            }
        }
        return false;
    }

    public Equipo_Jugador(LocalDate fechaInicio, LocalDate fechaFin, String nombreEquipo, String posicionCancha) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombreEquipo = nombreEquipo;
        this.posicionCancha = posicionCancha;
    }

    public Equipo_Jugador() {
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
