package co.edu.udec.act3.jonnyluna.vehiculos.controller;

import co.edu.udec.act3.jonnyluna.vehiculos.business.UsuarioBusiness;
import co.edu.udec.act3.jonnyluna.vehiculos.domain.response.VehiculoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/usuarios")
public class UsuariosRestController {
    @Autowired
    private UsuarioBusiness usuarioBusiness;
    @GetMapping("/vehiculos")
    public List<VehiculoResponse> obtenerVehiculosPorUsuario(
            @RequestParam("cedula") Integer cedula
            ){
        return usuarioBusiness.consultarVehiculosPorUsuario(cedula);
    }
}
