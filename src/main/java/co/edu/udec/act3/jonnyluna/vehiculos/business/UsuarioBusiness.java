package co.edu.udec.act3.jonnyluna.vehiculos.business;

import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;

import java.util.List;

public interface UsuarioBusiness {
    List<Usuario> findAllUsers();
    void saveUsuario(Usuario usuario);
}
