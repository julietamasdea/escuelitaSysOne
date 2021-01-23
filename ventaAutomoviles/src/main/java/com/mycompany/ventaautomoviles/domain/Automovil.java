package com.mycompany.ventaautomoviles.domain;

import java.util.ArrayList;
import java.util.List;

public class Automovil {
    private Modelo modelo;
    private List<Opcional> opcionales = new ArrayList<>();

    public Automovil() {
    }

    public Automovil(Modelo modelo, List<Opcional> opcionales) {
        this.modelo = modelo;
        this.opcionales = opcionales;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public List<Opcional> getOpcionales() {
        return opcionales;
    }

    public void setOpcionales(List<Opcional> opcionales) {
        this.opcionales = opcionales;
    }
}
