package co.edu.udec.act3.jonnyluna.vehiculos.business;

import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;
import co.edu.udec.act3.jonnyluna.vehiculos.repository.UsuarioRepository;
import co.edu.udec.act3.jonnyluna.vehiculos.repository.UsuarioRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioBusinessImpl implements UsuarioBusiness {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public List<Usuario> findAllUsers() {
        List<Usuario> result = usuarioRepository.findAllUsers();
        return result;
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioRepository.saveUser(usuario);
    }
}
