package com.mycompany.clasenumerodos;

public class matrizPromedioDeNotas {
    public static void main(String[] args) {
        int notas[][]      = {{4, 3, 2}, {4, 3, 2}, {5, 1, 5}, {1, 7, 8}, {3, 6, 7}, {6, 8, 7}, {6, 2, 7}, {6, 8, 7}, {3, 8, 9}, {8, 6, 7}};
        String[] nombres   = {"juana", "martina", "luana", "juan", "pedro", "felipe", "mateo", "martin", "valentina", "micaela"};

        int sumatoria_notas = 0;

        for (int i = 0; i < 10; i++) {
            sumatoria_notas = 0;
            for (int j = 0; j < 3; j++) {
                sumatoria_notas += notas[i][j];
            }
            System.out.println("El promedio de " + nombres[i] + " es: " + (sumatoria_notas/3));
        }
    }
}
