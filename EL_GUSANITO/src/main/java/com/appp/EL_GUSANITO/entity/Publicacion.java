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
public class Publicacion {
    
    // ATRIBUTOS
    int IDPublicacion;
    String Mensaje;
    String FechaSubida;
    String NombreUsuario;
    
    // ATRIBUTOS EXTERNOS
    int IDUser;
    
    // CONSTRUCTORES
    public Publicacion(String Mensaje, String FechaSubida, String NombreUsuario, int IDUser) {
        this.Mensaje = Mensaje;
        this.FechaSubida = FechaSubida;
        this.NombreUsuario = NombreUsuario;
        this.IDUser = IDUser;
    }
}
