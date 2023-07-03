package co.edu.udec.act3.jonnyluna.vehiculos.repository;

import co.edu.udec.act3.jonnyluna.vehiculos.domain.response.VehiculoResponse;
import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;
import co.edu.udec.act3.jonnyluna.vehiculos.repository.dao.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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
    public List<VehiculoResponse> buscarVehiculosPorUsuario(Integer cedula) {
        List<VehiculoResponse> vehiculoResponses = usuarioDao.buscarVehiculosPorUsuario(cedula);
        return vehiculoResponses;
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return usuarioDao.findByEmail(email);
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    public Usuario buscarPorCedula(Integer cedula) {
        return usuarioDao.findById(cedula).orElse(null);
    }

    @Override
    public Usuario editarUsuario(Usuario usuarioAEditar) {
        return usuarioDao.save(usuarioAEditar);
    }
}
