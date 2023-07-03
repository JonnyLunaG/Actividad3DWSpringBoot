package co.edu.udec.act3.jonnyluna.vehiculos.repository;

import co.edu.udec.act3.jonnyluna.vehiculos.model.Vehiculo;

import java.util.List;

public interface VehiculoRepository {

    //1) Agregar vehículo
    Vehiculo agregarVehiculo(Vehiculo vehiculo);

    //2) Consultar vehículo
    Vehiculo consultarPorPlaca(String placa);

    //3) Editar vehículo
    Vehiculo editarVehiculo(Vehiculo vehiculoAEditar);

    //4) Listar vehículos
    List<Vehiculo> listarVehiculos();

    //5) Eliminar vehículos
    void eliminarVehiculo(Integer id);

}
