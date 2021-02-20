package com.jugadores.afa.spring.afa.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties("historias")
public class EquipoDto {
    private Integer id;
    private Integer cuit;
    private String nombre;
    private List<HistoriaDto> historias;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<HistoriaDto> getHistorias() {
        return historias;
    }

    public void setHistorias(List<HistoriaDto> historias) {
        this.historias = historias;
    }
}
