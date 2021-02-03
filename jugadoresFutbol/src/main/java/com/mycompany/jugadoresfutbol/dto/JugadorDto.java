package com.mycompany.jugadoresfutbol.dto;

import java.time.LocalDate;
import java.util.List;

public class JugadorDto extends PersonaDto {
    private LocalDate fechaNacimiento;
    private LocalDate fechaDebut;
    private int partidosJugados;
    private int goles;
    private Double peso;
    private Double altura;
    private String posicionCancha;
    private List<Equipo_JugadorDto> historiaJugador;

    public JugadorDto() {
    }

    public JugadorDto(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }

    public JugadorDto(String nombre, String apellido, String email, String club, Integer dni, Integer telefono, DireccionDto direccion, LocalDate fechaInicio, LocalDate fechaFin, LocalDate fechaNacimiento, LocalDate fechaDebut, int partidosJugados, int goles, Double peso, Double altura, List<Equipo_JugadorDto> historiaJugador) {
        super(nombre, apellido, email, club, dni, telefono, direccion, fechaInicio, fechaFin);
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDebut = fechaDebut;
        this.partidosJugados = partidosJugados;
        this.goles = goles;
        this.peso = peso;
        this.altura = altura;
        this.historiaJugador = historiaJugador;
    }

    public JugadorDto(String nombre, String apellido, List<Equipo_JugadorDto> historiaJugador) {
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

    public List<Equipo_JugadorDto> getHistoriaJugador() {
        return historiaJugador;
    }

    public void setHistoriaJugador(List<Equipo_JugadorDto> historiaJugador) {
        this.historiaJugador = historiaJugador;
    }
}
