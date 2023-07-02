package co.edu.udec.act3.jonnyluna.vehiculos.controller;

import co.edu.udec.act3.jonnyluna.vehiculos.business.UsuarioBusiness;
import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class Controller {
    @Autowired
    private UsuarioBusiness usuarioBusiness;
    @GetMapping
    public List<Usuario> getAllUsers(){
        return usuarioBusiness.findAllUsers();
    }
    @PostMapping("/registro")
    public ResponseEntity<Void> registerUser(@RequestBody Usuario usuario){
        usuarioBusiness.saveUsuario(usuario);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
