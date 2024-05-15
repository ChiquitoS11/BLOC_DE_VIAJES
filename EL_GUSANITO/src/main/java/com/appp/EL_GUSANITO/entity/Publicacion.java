package com.appp.EL_GUSANITO.entity;

import java.sql.Date;
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
    int IDPublicacion; // Autoincremental, no incluido en el constructor
    String MensajeUsuario;
    Date FechaSubida;
    
    // ATRIBUTOS EXTERNOS
    int IDUsuario;
    
    // CONSTRUCTORES
    public Publicacion(String MensajeUsuario, Date FechaSubida, int IDUsuario) {
        this.MensajeUsuario = MensajeUsuario;
        this.FechaSubida = FechaSubida;
        this.IDUsuario = IDUsuario;
    }
}
