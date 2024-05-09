package com.ilerna.clientes.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/elgusanito")
public class ControllerElGusanito {
    @GetMapping({"/", ""})
    public String pagInformacion(Model model) {
        String valorfinal="./elgusanito/elgusanito";
        return valorfinal;
    }
    
    @GetMapping({"/inicio"})
    public String paginaInicio(Model model) {
        String valorfinal="./elgusanito/inicio";
        return valorfinal;
    }
}