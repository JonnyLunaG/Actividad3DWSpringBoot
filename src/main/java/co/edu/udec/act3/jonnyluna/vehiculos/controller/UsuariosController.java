package co.edu.udec.act3.jonnyluna.vehiculos.controller;

import co.edu.udec.act3.jonnyluna.vehiculos.business.UsuarioBusiness;
import co.edu.udec.act3.jonnyluna.vehiculos.domain.LoginRequest;
import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsuariosController {
    @Autowired
    private UsuarioBusiness usuarioBusiness;
    @GetMapping
    public List<Usuario> getAllUsers(){
        return usuarioBusiness.findAllUsers();
    }
    @PostMapping("registro")
    public String registerUser(
            @ModelAttribute("usuario") Usuario usuario
    ){
        usuarioBusiness.saveUsuario(usuario);
        return "redirect:index?registrado=true";
    }
    @GetMapping("formulario-registro")
    public String mostrarFormularioRegistro(
            @ModelAttribute("usuario") Usuario usuario
    ){
        return "registro";
    }
    @GetMapping("index")
    public String mostrarIndex(){
        return "index";
    }

    @GetMapping("/login")
    public String login(
            @ModelAttribute("user") LoginRequest loginRequest
    ){
        return "login";
    }
}
