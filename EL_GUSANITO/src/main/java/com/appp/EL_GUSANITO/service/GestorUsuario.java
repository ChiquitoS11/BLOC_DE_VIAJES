/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.appp.EL_GUSANITO.service;

import com.appp.EL_GUSANITO.database.Conexion;
import com.appp.EL_GUSANITO.entity.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author ChiquitoS11
 */
@Service
public class GestorUsuario {
    Conexion con = new Conexion();
    
    // ALTA A UN CLIENTE
    public void alta(Usuario p) throws SQLException {
        Statement consulta = con.getConnection().createStatement();

        String cadena = "INSERT INTO usuario(nombre, nombreUsuario, contrasenia) VALUES ('"
                + p.getNombre() + "','"
                + p.getNombreUsuario() + "','"
                + p.getContrasenia() + "');";
        
        consulta.executeUpdate(cadena);
        consulta.close();
    }
    
    // NO SE REPITA USUARIO
    public void isRepetido(String nombreUsuario) throws SQLException, Exception{
        Statement stmt = con.getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM usuario");

        while (rs.next()) {
            if (rs.getString("nombreUsuario").equalsIgnoreCase(nombreUsuario)) {
                System.out.println("error");
                throw new Exception("Nombre de usuario repetido");
            }

        }
        rs.close();
    }
    
    public void isValido(String nombreUsuario, String contrasenia) throws SQLException, Exception{
        Statement stmt = con.getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM usuario");

        while (rs.next()) {
            if (rs.getString("nombreUsuario").equalsIgnoreCase(nombreUsuario)) {
                if (rs.getString("contrasenia").equalsIgnoreCase(contrasenia)) {
                    return;
                }
            } 
            
        }
        rs.close();
        
        throw new Exception("Credenciales incorrectas");
    }
}
