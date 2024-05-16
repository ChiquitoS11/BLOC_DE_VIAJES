package com.appp.EL_GUSANITO.Controller;

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
    @GetMapping("/principal/inicio")
	public String login_and_register(String nombre, Model model) {
            
		model.addAttribute("nombre", nombre);
		return "./principal/inicio";
	}
}
