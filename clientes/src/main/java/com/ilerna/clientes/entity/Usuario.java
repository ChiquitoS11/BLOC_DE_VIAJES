/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ilerna.clientes.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 *
 * @author Alumno
 */
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Usuario {
    
    // ATRIBUTOS
    private int id; // Autoincremental, no incluido en el constructor
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
