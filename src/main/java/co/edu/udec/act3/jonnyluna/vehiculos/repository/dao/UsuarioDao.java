package co.edu.udec.act3.jonnyluna.vehiculos.repository.dao;

import co.edu.udec.act3.jonnyluna.vehiculos.domain.response.VehiculoResponse;
import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UsuarioDao extends JpaRepository<Usuario,Integer> {
    @Query("SELECT new co.edu.udec.act3.jonnyluna.vehiculos.domain.response.VehiculoResponse(" +
            "v.placa, " +
            "v.marca, " +
            "v.modelo," +
            "v.cilindraje," +
            "v.numPuestos, " +
            "v.color" +
            ") FROM Vehiculo v INNER JOIN Usuario u ON v.usuario.cedula = u.cedula " +
            "WHERE u.cedula = :cedula")
    List<VehiculoResponse> buscarVehiculosPorUsuario(@Param("cedula") Integer cedula);

    Optional<Usuario> findByEmail(String email);
}
