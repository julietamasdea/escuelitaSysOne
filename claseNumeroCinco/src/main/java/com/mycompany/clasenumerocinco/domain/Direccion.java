package com.mycompany.clasenumerocinco.domain;

public class Direccion {
    private int numero;
    private String calle;
    private String localidad;
    private String provincia;

    public Direccion() {
    }

    public Direccion(int numero, String calle, String localidad, String provincia) {
        this.numero = numero;
        this.calle = calle;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
