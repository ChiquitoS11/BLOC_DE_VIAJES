/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ilerna.clientes.entity;

/**
 *
 * @author Alumno
 */
public class Usuario {
    private int id; //El id no va en el construcor porque es AI.

    public Usuario(int id, String nombre, String Apellido) {
        this.id = id;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }
    private String nombre;
    private String Apellido;


    public Usuario(String nombre, String Apellido) {
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
}
