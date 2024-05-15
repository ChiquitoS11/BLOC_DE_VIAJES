package com.appp.EL_GUSANITO.service;

import com.appp.EL_GUSANITO.database.Conexion;
import com.appp.EL_GUSANITO.entity.Publicacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ChiquitoS11
 */
public class GestorPublicacion {
    Conexion con = new Conexion();
    
    // CREAR UNA PUBLICACION
    public void alta(Publicacion p) throws SQLException {
        Statement consulta = con.getConnection().createStatement();
        
        String cadena = "INSERT INTO publicacion(mensajeUsuario, fechaSubida, IDUsuario) VALUES ('"
                + p.getMensajeUsuario() + "','"
                + p.getFechaSubida() + "','"
                + p.getIDUsuario() + "');";

        consulta.executeUpdate(cadena);
        consulta.close();
    }
    
    // LISTAR LAS PUBLICACIONES
    public List<Publicacion> listar() throws SQLException {
        Statement consulta = con.getConnection().createStatement();
        ResultSet rs = consulta.executeQuery("SELECT * FROM publicacion");
        List<Publicacion> lista = new ArrayList<>();

        while (rs.next()) {
            Publicacion p = new Publicacion(
                    rs.getInt("IDPublicacion"),
                    rs.getString("mensajeUsuario"),
                    rs.getDate("fechaSubida"),
                    rs.getInt("IDUsuario")
            );
            lista.add(p);
        }
        rs.close();
        consulta.close();
        return lista;
    }
}
