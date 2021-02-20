package com.jugadores.afa.spring.afa.model.dto;

import java.sql.Date;
import java.time.LocalDate;

public class HistoriaDto {
    private Integer id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String nombreEquipo;
    private String posicionCancha;
    private EquipoDto equipo;
    private JugadorDto jugador;

    public Date convertLocalDate(LocalDate localDate) {
        return Date.valueOf(localDate);
    }

    public LocalDate convertDate(Date date) {
        return date.toLocalDate();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
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

    public EquipoDto getEquipo() {
        return equipo;
    }

    public void setEquipo(EquipoDto equipo) {
        this.equipo = equipo;
    }

    public JugadorDto getJugador() {
        return jugador;
    }

    public void setJugador(JugadorDto jugador) {
        this.jugador = jugador;
    }
}
