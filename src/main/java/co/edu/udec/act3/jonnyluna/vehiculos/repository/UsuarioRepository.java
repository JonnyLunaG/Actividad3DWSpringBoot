package co.edu.udec.act3.jonnyluna.vehiculos.repository;

import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;

import java.util.List;

public interface UsuarioRepository {
    List<Usuario> findAllUsers();
    void saveUser(Usuario usuario);
}
