package com.mycompany.jugadoresfutbol.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EquipoDto {
    private int cuit;
    private String nombre;
    private LocalDate fechaFundacion;
    private String nombrePresidente;
    private String apellidoPresidente;
    private DireccionDto direccion;
    private ArrayList<Integer> telefonos;
    private LocalDate fechaInicioPrimeraDivision;
    private LocalDate fechaFinPrimeraDivision;
    private String categoriaActual;
    private DtDto directorTecnico;
    private List<JugadorDto> jugadores;

    public EquipoDto() {
        this.jugadores = new ArrayList();
    }

    public EquipoDto(String nombre) {
        this.jugadores = new ArrayList();
        this.nombre = nombre;
    }

    public EquipoDto(int cuit, String nombre, String categoriaActual) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.categoriaActual = categoriaActual;
    }

    public EquipoDto(String nombre, LocalDate fechaFundacion, String nombrePresidente, String apellidoPresidente, DireccionDto direccion, ArrayList<Integer> telefonos, LocalDate fechaInicioPrimeraDivision, LocalDate fechaFinPrimeraDivision, String categoriaActual) {
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

    public DtDto getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(DtDto directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public void setJugadores(List<JugadorDto> jugadores) {
        this.jugadores = jugadores;
    }

    public List<JugadorDto> getJugadores() {
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

    public DireccionDto getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionDto direccion) {
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
