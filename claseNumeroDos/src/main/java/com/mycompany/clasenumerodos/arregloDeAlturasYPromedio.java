package com.mycompany.clasenumerodos;

public class arregloDeAlturasYPromedio {
    public static void main(String[] args) {
        int[] alturas         = {165,122,152,107,172,202,130,178,125,5};
        String[] nombres      = {"juana", "martina", "luana", "juan", "pedro", "felipe", "mateo", "martin", "valentina", "micaela"};

        int  altura_maxima    = 0;
        int  altura_minima    = 99999;
        int  suma_alturas     = 0;

        String  nombre_maxima = null;
        String  nombre_minima = null;

        for (int i = 0; i < 10; i++) {
            suma_alturas += alturas[i];

            if (altura_maxima < alturas[i]) {
                altura_maxima = alturas[i];
                nombre_maxima = nombres[i];
            }
            if (altura_minima > alturas[i]) {
                altura_minima = alturas[i];
                nombre_minima = nombres[i];
            }
        }
        System.out.println("Altura maxima: " + nombre_maxima + " " + altura_maxima);
        System.out.println("Altura minima: " + nombre_minima + " " + altura_minima);
        System.out.println("Promedio alturas: " + (suma_alturas/10));
    }
}
