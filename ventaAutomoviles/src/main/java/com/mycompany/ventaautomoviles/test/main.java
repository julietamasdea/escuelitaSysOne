package com.mycompany.ventaautomoviles.test;

import com.mycompany.ventaautomoviles.data.GeneracionDatos;
import com.mycompany.ventaautomoviles.domain.Venta;

import java.util.List;

public class main {
    public static void main(String[] args) {
        GeneracionDatos generacionDatos = new GeneracionDatos();
        List<Venta> ventas = generacionDatos.getVentas();
        int contador = 1;
        for (Venta v:ventas) {
            System.out.println("Venta " + contador + " costo final: " + v.getCostoFinal());
            contador ++;
        }
    }
}
