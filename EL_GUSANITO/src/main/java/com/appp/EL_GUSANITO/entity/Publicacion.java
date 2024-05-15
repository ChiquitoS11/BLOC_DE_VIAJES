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
    String FechaSubida;
    
    // ATRIBUTOS EXTERNOS
    int IDUsuario;
    
    // CONSTRUCTORES
    public Publicacion(String FechaSubida, int IDUsuario) {
        this.FechaSubida = FechaSubida;
        this.IDUsuario = IDUsuario;
    }
}
