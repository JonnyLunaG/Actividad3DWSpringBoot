package co.edu.udec.act3.jonnyluna.vehiculos.business;

import co.edu.udec.act3.jonnyluna.vehiculos.domain.request.UpdatableVehicleRequest;
import co.edu.udec.act3.jonnyluna.vehiculos.domain.request.VehiculoRequest;
import co.edu.udec.act3.jonnyluna.vehiculos.domain.response.VehiculoResponse;
import co.edu.udec.act3.jonnyluna.vehiculos.model.Vehiculo;

import java.util.List;

public interface VehiculoBusiness {
    //1) Agregar vehículo
    Vehiculo agregarVehiculo(VehiculoRequest vehiculoRequest);

    //2) Consultar vehículo
    VehiculoResponse consultarPorPlaca(String placa);

    //3) Editar vehículo
    Vehiculo editarVehiculo(UpdatableVehicleRequest updatableVehicleRequest);

    //4) Listar vehículos
    List<Vehiculo> listarVehiculos();

    //5) Eliminar vehículos
    void eliminarVehiculo(String placa);

}
