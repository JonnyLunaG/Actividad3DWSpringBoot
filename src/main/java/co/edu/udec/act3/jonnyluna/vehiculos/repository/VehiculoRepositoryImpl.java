package co.edu.udec.act3.jonnyluna.vehiculos.repository;

import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;
import co.edu.udec.act3.jonnyluna.vehiculos.model.Vehiculo;
import co.edu.udec.act3.jonnyluna.vehiculos.repository.dao.VehiculoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository {

    @Autowired
    private VehiculoDao vehiculoDao;
    @Override
    public Vehiculo agregarVehiculo(Vehiculo vehiculo) {
        return vehiculoDao.save(vehiculo);
    }

    @Override
    public Vehiculo consultarPorPlaca(String placa) {
        return vehiculoDao.findByPlaca(placa).orElse(null);
    }

    @Override
    public Vehiculo editarVehiculo(Vehiculo vehiculoAEditar) {
        return vehiculoDao.save(vehiculoAEditar);
    }

    @Override
    public List<Vehiculo> listarVehiculos() {
        return vehiculoDao.findAll();
    }

    @Override
    public void eliminarVehiculo(Integer id) {
        vehiculoDao.deleteById(id);
    }
}
