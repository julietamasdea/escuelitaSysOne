package com.mycompany.jugadoresfutbol.test;


import com.mycompany.jugadoresfutbol.data.GeneracionDatos;
import com.mycompany.jugadoresfutbol.data.Metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*
        GeneracionDatos generacionDatos = new GeneracionDatos();
        Metodos metodos = new Metodos();
        LocalDate fecha = LocalDate.of(2014,05,12);
        for (String i : generacionDatos.equipos.keySet()) {
            System.out.println("Equipo: " + i + ", cantidad jugadores en la fecha "
                  + fecha + ": " + metodos.cantidadJugadoresEnFecha(fecha, generacionDatos.equipos.get(i))
            + ", defensores: " + metodos.cantidadDefensoresEquipo(generacionDatos.equipos.get(i)));

        }

         */
        conexionBD();
    }
    public static void conexionBD() {


        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String usr = "root";
        String pwd = "julietamasdea";
        String query = "insert into jugadoresfutbol.equipo (cuit,nombre,categoria) values (1,'River','A')";

        try {
            Connection connection = DriverManager.getConnection(url, usr, pwd);;

            Statement instruction = connection.createStatement();
            instruction.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
