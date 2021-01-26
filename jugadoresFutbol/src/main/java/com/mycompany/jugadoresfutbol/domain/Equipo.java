package com.mycompany.jugadoresfutbol.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private LocalDate fechaFundacion;
    private String nombrePresidente;
    private String apellidoPresidente;
    private Direccion direccion;
    private ArrayList<Integer> telefonos;
    private LocalDate fechaInicioPrimeraDivision;
    private LocalDate fechaFinPrimeraDivision;
    private String categoriaActual;
    private Dt directorTecnico;
    private List<Jugador> jugadores;

    public Equipo() {
        this.jugadores = new ArrayList();
    }

    public Equipo(String nombre) {
        this.jugadores = new ArrayList();
        this.nombre = nombre;
    }

    public Equipo(String nombre, LocalDate fechaFundacion, String nombrePresidente, String apellidoPresidente, Direccion direccion, ArrayList<Integer> telefonos, LocalDate fechaInicioPrimeraDivision, LocalDate fechaFinPrimeraDivision, String categoriaActual) {
        this.jugadores = new ArrayList();
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.nombrePresidente = nombrePresidente;
        this.apellidoPresidente = apellidoPresidente;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.fechaInicioPrimeraDivision = fechaInicioPrimeraDivision;
        this.fechaFinPrimeraDivision = fechaFinPrimeraDivision;
        this.categoriaActual = categoriaActual;
    }

    public Dt getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(Dt directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public List getJugadores() {
        return jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }

    public String getApellidoPresidente() {
        return apellidoPresidente;
    }

    public void setApellidoPresidente(String apellidoPresidente) {
        this.apellidoPresidente = apellidoPresidente;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Integer> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Integer> telefonos) {
        this.telefonos = telefonos;
    }

    public LocalDate getFechaInicioPrimeraDivision() {
        return fechaInicioPrimeraDivision;
    }

    public void setFechaInicioPrimeraDivision(LocalDate fechaInicioPrimeraDivision) {
        this.fechaInicioPrimeraDivision = fechaInicioPrimeraDivision;
    }

    public LocalDate getFechaFinPrimeraDivision() {
        return fechaFinPrimeraDivision;
    }

    public void setFechaFinPrimeraDivision(LocalDate fechaFinPrimeraDivision) {
        this.fechaFinPrimeraDivision = fechaFinPrimeraDivision;
    }

    public String getCategoriaActual() {
        return categoriaActual;
    }

    public void setCategoriaActual(String categoriaActual) {
        this.categoriaActual = categoriaActual;
    }
}
