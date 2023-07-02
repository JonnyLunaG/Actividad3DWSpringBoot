package co.edu.udec.act3.jonnyluna.vehiculos.repository;

import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;
import co.edu.udec.act3.jonnyluna.vehiculos.repository.dao.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {
    @Autowired
    private UsuarioDao usuarioDao;
    @Override
    public List<Usuario> findAllUsers() {
        List<Usuario> result = usuarioDao.findAll();
        return result;
    }

    @Override
    public void saveUser(Usuario usuario) {
        Usuario saved = usuarioDao.save(usuario);
    }
}
