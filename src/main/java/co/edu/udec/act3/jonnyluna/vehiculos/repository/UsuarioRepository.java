package co.edu.udec.act3.jonnyluna.vehiculos.repository;

import co.edu.udec.act3.jonnyluna.vehiculos.domain.request.UsuarioRequest;
import co.edu.udec.act3.jonnyluna.vehiculos.domain.response.VehiculoResponse;
import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {
    //1) Agregar usuario
    Usuario guardarUsuario(Usuario usuario);
    //2) Consultar usuario
    Usuario buscarPorCedula(Integer cedula);
    //3) Editar usuario
    Usuario editarUsuario(Usuario usuarioAEditar);
    //4) Listar usuarios
    List<Usuario> findAllUsers();
    List<VehiculoResponse> buscarVehiculosPorUsuario(Integer cedula);

    Optional<Usuario> findByEmail(String email);
}
