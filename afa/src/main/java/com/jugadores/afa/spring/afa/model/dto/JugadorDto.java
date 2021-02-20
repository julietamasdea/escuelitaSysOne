package com.jugadores.afa.spring.afa.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties("historias")
public class JugadorDto {
    private Integer id;
    private Integer dni;
    private String nombre;
    private String apellido;
    private List<HistoriaDto> historias;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
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

    public List<HistoriaDto> getHistorias() {
        return historias;
    }

    public void setHistorias(List<HistoriaDto> historias) {
        this.historias = historias;
    }
}

