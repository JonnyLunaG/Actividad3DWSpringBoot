package co.edu.udec.act3.jonnyluna.vehiculos.controller;

import co.edu.udec.act3.jonnyluna.vehiculos.business.UsuarioBusiness;
import co.edu.udec.act3.jonnyluna.vehiculos.business.VehiculoBusiness;
import co.edu.udec.act3.jonnyluna.vehiculos.domain.LoginRequest;
import co.edu.udec.act3.jonnyluna.vehiculos.domain.request.UpdatableVehicleRequest;
import co.edu.udec.act3.jonnyluna.vehiculos.model.SecurityUser;
import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsuariosController {
    @Autowired
    private UsuarioBusiness usuarioBusiness;
    @Autowired
    private VehiculoBusiness vehiculoBusiness;
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
    @GetMapping("/index")
    public String mostrarIndex(
            Model model
    ){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username  = null;
        if(!authentication.getName().equals("anonymousUser")){
             username = authentication.getName();
        }

        model.addAttribute("username", username);
        return "index";
    }

    @GetMapping("/login")
    public String login(
            @ModelAttribute("user") LoginRequest loginRequest
    ){
        return "login";
    }
    @GetMapping("/logout")
    public String logout(){
        return "redirect:/login?logout";
    }
    @GetMapping("/vehiculos")
    public String getVehiculos(
            Model model
    ){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username  = null;

        if(!authentication.getName().equals("anonymousUser")){
            username = authentication.getName();
            SecurityUser securityUser = (SecurityUser) authentication.getPrincipal();
            model.addAttribute("vehiculos",usuarioBusiness.consultarVehiculosPorUsuario(securityUser.getUsuario().getCedula()));
        }

        model.addAttribute("username", username);
        return "vehiculos";
    }
    @GetMapping("/eliminacion/{id}")
    public String deleteVehiculo(@PathVariable("id") String placa){
        vehiculoBusiness.eliminarVehiculo(placa);
        return "redirect:/vehiculos?deleted=true";
    }
    @PostMapping("/editar")
    public String editVehiculo(@ModelAttribute("vehiculo") UpdatableVehicleRequest updatableVehicleRequest){
        vehiculoBusiness.editarVehiculo(updatableVehicleRequest);
        return "redirect:/vehiculos?updated=true";
    }
    @GetMapping("/formulario-actualizacion/{id}")
    public String showVehiculoUpdateForm(
            @PathVariable("id") String placa,
            @ModelAttribute("vehiculo") UpdatableVehicleRequest updatableVehicleRequest
    ){
        return "editarvehiculo";
    }

}
