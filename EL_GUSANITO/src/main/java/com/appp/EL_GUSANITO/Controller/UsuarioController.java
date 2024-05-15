package com.appp.EL_GUSANITO.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ChiquitoS11
 */
@Controller
public class UsuarioController {
        @GetMapping("/login-register")
	public String greeting(/*@RequestParam(name="name", required=false, defaultValue="World") */String name, Model model) {
//		model.addAttribute("name", name);
		return "./usuario/login-register";
	}
}
