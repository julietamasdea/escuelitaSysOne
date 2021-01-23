package com.mycompany.ventaautomoviles.data;

import com.mycompany.ventaautomoviles.domain.Automovil;
import com.mycompany.ventaautomoviles.domain.Modelo;
import com.mycompany.ventaautomoviles.domain.Opcional;
import com.mycompany.ventaautomoviles.domain.Venta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneracionDatos {
    private List<Opcional> opcionales;
    private List<Automovil> automoviles;
    private List<Venta> ventas;

    public GeneracionDatos() {
        this.opcionales  = new ArrayList<>();
        this.automoviles = new ArrayList<>();
        this.ventas      = new ArrayList<>();
        generarDatos();
    }

    public void generarDatos() {
        this.opcionales.add(new Opcional("Techo corredizo", 12000));
        this.opcionales.add(new Opcional("Aire Acondicionado", 20000));
        this.opcionales.add(new Opcional("Sistemas de Frenos", 14000));
        this.opcionales.add(new Opcional("Airbag", 7000));
        this.opcionales.add(new Opcional("Llantas de Aleacion", 12000));

        this.automoviles.add(new Automovil(Modelo.valueOf("Sedan"), Arrays.asList(this.opcionales.get(0),this.opcionales.get(2),this.opcionales.get(4))));
        this.automoviles.add(new Automovil(Modelo.valueOf("Familiar"), Arrays.asList(this.opcionales.get(0),this.opcionales.get(2),this.opcionales.get(4))));
        this.automoviles.add(new Automovil(Modelo.valueOf("Sedan"), Arrays.asList(this.opcionales.get(2),this.opcionales.get(2),this.opcionales.get(2))));
        this.automoviles.add(new Automovil(Modelo.valueOf("Coupe"), Arrays.asList(this.opcionales.get(0))));
        this.automoviles.add(new Automovil(Modelo.valueOf("Familiar"), null));
        this.automoviles.add(new Automovil(Modelo.valueOf("Coupe"), Arrays.asList(this.opcionales.get(0),this.opcionales.get(1),this.opcionales.get(2),this.opcionales.get(3),this.opcionales.get(4))));
        this.automoviles.add(new Automovil(Modelo.valueOf("Familiar"), Arrays.asList(this.opcionales.get(0))));

        this.ventas.add(new Venta("Pablo", "Sanchez", 30381231, Arrays.asList(this.automoviles.get(1),this.automoviles.get(2))));
        this.ventas.add(new Venta("Maria", "Holies", 12412451, Arrays.asList(this.automoviles.get(5))));
        this.ventas.add(new Venta("Lourdes", "Perez", 72618843, Arrays.asList(this.automoviles.get(1),this.automoviles.get(2),this.automoviles.get(0),this.automoviles.get(2))));

    }

    public List<Opcional> getOpcionales() {
        return opcionales;
    }

    public void setOpcionales(List<Opcional> opcionales) {
        this.opcionales = opcionales;
    }

    public List<Automovil> getAutomoviles() {
        return automoviles;
    }

    public void setAutomoviles(List<Automovil> automoviles) {
        this.automoviles = automoviles;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
}
