/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ilerna.clientes.Controller;

import com.ilerna.clientes.entity.Cliente;
import com.ilerna.clientes.service.GestorClientes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/usuario")
public class ControllerUsuario {
    GestorClientes ge = new GestorClientes ();
    @GetMapping("/")
    public String crud(Model model){
        String valorfinal="./cliente/listarcliente";
        try {
            model.addAttribute("clientes", ge.listar());
        } catch (SQLException ex) {
            Logger.getLogger(ControllerCliente.class.getName()).log(Level.SEVERE, null, ex);
            valorfinal="error";
        }
        return valorfinal;
    }
    @GetMapping("/alta")
    public String greetingForm(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "./cliente/altacliente";
    }
    @PostMapping("/alta")
    public String greetingSubmit(@ModelAttribute Cliente cliente, Model model) {
        String valorfinal="redirect:/cliente/";
        try {
            ge.alta(cliente);
            try {
                model.addAttribute("clientes", ge.listar());
            } catch (SQLException ex) {
                Logger.getLogger(ControllerCliente.class.getName()).log(Level.SEVERE, null, ex);
                valorfinal="error";
            }
        } catch (SQLException ex) {
            valorfinal="error";
        }
        return valorfinal;
    }
    @GetMapping("/eliminar")
    public String SubmitB (@RequestParam("codcliente") int id, Model model){
        String valorfinal="redirect:/cliente/";
        try {
            ge.eliminar(id);
            model.addAttribute("clientes", ge.listar());
        } catch (SQLException ex) {
            valorfinal="error";
        }
        //return new ModelAndView(valorfinal, model.asMap());
        return valorfinal;
    }
    @GetMapping("/modificar")
    public String modificar(@RequestParam ("codcliente") int id,Model model){
        String valorfinal="./cliente/modificarcliente";
        try {
            model.addAttribute("cliente", ge.buscar(id));
        } catch (SQLException ex) {
            Logger.getLogger(ControllerCliente.class.getName()).log(Level.SEVERE, null, ex);
            valorfinal="error";
        }
        return valorfinal;
    }
    @PostMapping("/modificar")
    public String modificarBBDD (@ModelAttribute Cliente cliente, Model model){
        String valorfinal="redirect:/cliente/";
        try {
            ge.modificar(cliente);
            model.addAttribute("clientes",ge.listar());
        } catch (SQLException ex) {
            Logger.getLogger(ControllerCliente.class.getName()).log(Level.SEVERE, null, ex);
            valorfinal="error";
        }
        return valorfinal;
    }
=======
/**
 *
 * @author Alumno
 */
public class ControllerUsuario {
    
}
