package com.appp.EL_GUSANITO.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ChiquitoS11
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Usuario {
    
    // ATRIBUTOS
    private int IDUsuario; // Autoincremental, no incluido en el constructor
    private String nombre;
    private String nombreUsuario;
    private String contrasenia;
    
    // CONSTRUCTORES
    public Usuario(String nombre, String nombreUsuario, String contrasenia) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }
}