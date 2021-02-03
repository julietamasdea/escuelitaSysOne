package com.mycompany.jugadoresfutbol.dto;

import java.time.LocalDate;

public class PersonaDto {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String club;

    private Integer dni;
    private Integer telefono;
    private DireccionDto direccion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public PersonaDto() {
    }

    public PersonaDto(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public PersonaDto(String nombre, String apellido, String email, String club, Integer dni, Integer telefono, DireccionDto direccion, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.club = club;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public PersonaDto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public DireccionDto getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionDto direccion) {
        this.direccion = direccion;
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
}
