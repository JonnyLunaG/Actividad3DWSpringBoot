package co.edu.udec.act3.jonnyluna.vehiculos.repository.dao;

import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioDao extends JpaRepository<Usuario,Integer> {
}
