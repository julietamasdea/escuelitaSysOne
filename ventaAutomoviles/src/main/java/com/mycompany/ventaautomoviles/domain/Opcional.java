package com.mycompany.ventaautomoviles.domain;

public class Opcional {
    private String descripcion;
    private double precio;

    public Opcional() {
    }

    public Opcional(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
