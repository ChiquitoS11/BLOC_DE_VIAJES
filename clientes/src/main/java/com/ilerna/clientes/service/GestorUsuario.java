/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ilerna.clientes.service;


import com.ilerna.clientes.database.Conexion;
import com.ilerna.clientes.entity.Fabricante;
import com.ilerna.clientes.entity.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Alumno
 */
public class GestorUsuario {

    Conexion c = new Conexion();
    
    public List<Usuario> listar() throws SQLException {
        Statement consulta = c.conectar().createStatement();
        ResultSet rs = consulta.executeQuery("SELECT * FROM usuario");
        List<Usuario> usuarios = new ArrayList<>();

        while (rs.next()) {
            Usuario u = new Usuario(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellidos")
            );
            usuarios.add(u);
        }
        rs.close();
        consulta.close();
        return usuarios;
    }
    //b
}
