package com.appp.EL_GUSANITO.Controller;

import com.appp.EL_GUSANITO.entity.Usuario;
import com.appp.EL_GUSANITO.service.GestorUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ChiquitoS11
 */
@Controller
public class InicioContoller {
    
    @Autowired
    private GestorUsuario ge;
    
    @GetMapping("/principal/inicio")
	public String login_and_register(String nombreUsuario, Model model) {
            
        try {
            Usuario usuarioActual = ge.getUsuario(nombreUsuario);
            
            model.addAttribute("usuarioActual", usuarioActual);
            
        } catch (Exception ex) {
            Logger.getLogger(InicioContoller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "./principal/inicio";
    }
}
