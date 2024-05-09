/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ilerna.clientes.service;

import com.ilerna.clientes.database.Conexion;
import com.ilerna.clientes.entity.Fabricante;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class GestorFabricantes {
    Conexion c = new Conexion();
    
    public List<Fabricante> listar() throws SQLException {
        Statement consulta = c.conectar().createStatement();
        ResultSet rs = consulta.executeQuery("SELECT * FROM fabricante");
        List<Fabricante> lista = new ArrayList<>();

        while (rs.next()) {
//////////            Fabricante p = new Fabricante(
//////////                    rs.getInt("id"),
//////////                    rs.getString("nombre"),
//////////                    rs.getInt("edad")
//////////            );
//////////            lista.add(p);
        }
        rs.close();
        consulta.close();
        return lista;
    }
}
