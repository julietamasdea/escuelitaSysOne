package com.mycompany.ventaautomoviles.domain;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String nombreCliente;
    private String apellidoCliente;
    private int dniCliente;
    private List<Automovil> automoviles;
    private double costoFinal;

    public void costoFinal() {
        List<Opcional> opcionales = new ArrayList<>();

        this.costoFinal = 0;
        if (automoviles != null) {
            for (Automovil automovil:automoviles) {
                costoFinal += automovil.getModelo().getPrecio();
                opcionales = automovil.getOpcionales();
                for (Opcional opcional:opcionales ) {
                    costoFinal += opcional.getPrecio();
                }
            }
        }
    }

    public Venta() {
    }

    public Venta(String nombreCliente, String apellidoCliente, int dniCliente, List<Automovil> automoviles) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.dniCliente = dniCliente;
        this.automoviles = automoviles;
        costoFinal();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public List<Automovil> getAutomoviles() {
        return automoviles;
    }

    public void setAutomoviles(List<Automovil> automoviles) {
        this.automoviles = automoviles;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(double costoFinal) {
        this.costoFinal = costoFinal;
    }
}
