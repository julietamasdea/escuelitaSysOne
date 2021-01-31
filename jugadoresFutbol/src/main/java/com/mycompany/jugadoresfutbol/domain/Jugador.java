package com.mycompany.jugadoresfutbol.domain;

import java.time.LocalDate;
import java.util.List;

public class Jugador extends Persona {
    private LocalDate fechaNacimiento;
    private LocalDate fechaDebut;
    private int partidosJugados;
    private int goles;
    private Double peso;
    private Double altura;
    private String posicionCancha;
    private List<Equipo_Jugador> historiaJugador;

    public Jugador() {
    }

    public Jugador(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }

    public Jugador(String nombre, String apellido, String email, String club, Integer dni, Integer telefono, Direccion direccion, LocalDate fechaInicio, LocalDate fechaFin, LocalDate fechaNacimiento, LocalDate fechaDebut, int partidosJugados, int goles, Double peso, Double altura, List<Equipo_Jugador> historiaJugador) {
        super(nombre, apellido, email, club, dni, telefono, direccion, fechaInicio, fechaFin);
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDebut = fechaDebut;
        this.partidosJugados = partidosJugados;
        this.goles = goles;
        this.peso = peso;
        this.altura = altura;
        this.historiaJugador = historiaJugador;
    }

    public Jugador(String nombre, String apellido, List<Equipo_Jugador> historiaJugador) {
        super(nombre, apellido);
        this.historiaJugador = historiaJugador;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaDebut() {
        return fechaDebut;
    }

    public void setFechaDebut(LocalDate fechaDebut) {
        this.fechaDebut = fechaDebut;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getPosicionCancha() {
        return posicionCancha;
    }

    public void setPosicionCancha(String posicionCancha) {
        this.posicionCancha = posicionCancha;
    }

    public List<Equipo_Jugador> getHistoriaJugador() {
        return historiaJugador;
    }

    public void setHistoriaJugador(List<Equipo_Jugador> historiaJugador) {
        this.historiaJugador = historiaJugador;
    }
}
