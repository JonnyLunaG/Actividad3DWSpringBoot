package co.edu.udec.act3.jonnyluna.vehiculos.repository.dao;

import co.edu.udec.act3.jonnyluna.vehiculos.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VehiculoDao extends JpaRepository<Vehiculo,Integer> {
    Optional<Vehiculo> findByPlaca(String placa);
}
