package com.mycompany.ventaautomoviles.domain;

public enum Modelo {
    Sedan(230000),
    Familiar(245000),
    Coupe(270000);
    private double precio;

    Modelo(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
