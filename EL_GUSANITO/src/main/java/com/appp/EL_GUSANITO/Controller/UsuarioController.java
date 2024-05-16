package com.appp.EL_GUSANITO.Controller;

import com.appp.EL_GUSANITO.entity.Usuario;
import com.appp.EL_GUSANITO.service.GestorUsuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ChiquitoS11
 */
@Controller
public class UsuarioController {
    
        @Autowired
        private GestorUsuario ge;
    
        
        @GetMapping("/login-register")
        public String mostrar_Login_Register(Model model) {
            return "./usuario/login-register";
        }
        @GetMapping("/login-register")
        public String mostrar_Login_Register_RegistroMal(Model model) {
            return "./usuario/login-register-registerbad";
        }
        @GetMapping("/login-register")
        public String mostrar_Login_Register_LoginMal(Model model) {
            return "./usuario/login-register-loginbad";
        }
        @PostMapping("/registro")
        public String loginRegister(@RequestParam("nombreUsuarioRegister") String nombreUsuario, 
                                    @RequestParam("nombreRegister") String nombre, 
                                    @RequestParam("contraseniaRegister") String contrasenia) {
            try {
                ge.isRepetido(nombreUsuario);
                
                ge.alta(new Usuario(nombre, nombreUsuario, contrasenia));
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
                return "redirect:/login-register";
            }

            // Después de realizar la lógica de registro, puedes redirigir a una página de confirmación o a donde necesites
            return "redirect:/test";
        }
        @PostMapping("/iniciarSeccion")
        public String iniciarSeccion(@RequestParam("nombreUsuarioLogin") String nombreUsuario, 
                                    @RequestParam("contraseniaLogin") String contrasenia) {
//            try {
//                
//            } catch (SQLException ex) {
//                Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
//            }

            // Después de realizar la lógica de registro, puedes redirigir a una página de confirmación o a donde necesites
            return "redirect:/test";
        }
}
