package com.appp.EL_GUSANITO.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class Conexion {
    String url = "jdbc:mysql://localhost:3306/elgusanito";
    String user = "root";
    String pass = "";
    Connection c;

    public Connection getConnection() throws SQLException {
        c = DriverManager.getConnection(url, user, pass);
        return c;
    }
}
