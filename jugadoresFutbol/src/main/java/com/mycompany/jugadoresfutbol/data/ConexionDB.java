package com.mycompany.jugadoresfutbol.data;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class ConexionDB {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jugadoresfutbol?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "julietamasdea";

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);;
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void closeConnection(Connection conn) throws SQLException {
        conn.close();
    }

    public static void closeConnection(Statement stmt) throws SQLException {
        stmt.close();
    }
}
