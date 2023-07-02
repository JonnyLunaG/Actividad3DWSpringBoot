package co.edu.udec.act3.jonnyluna.vehiculos.business;

import co.edu.udec.act3.jonnyluna.vehiculos.domain.request.VehiculoRequest;
import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;
import co.edu.udec.act3.jonnyluna.vehiculos.model.Vehiculo;

import java.util.List;

public interface VehiculoBusiness {
    //1) Agregar vehículo
    Vehiculo agregarVehiculo(VehiculoRequest vehiculoRequest);

    //2) Consultar vehículo
    Vehiculo consultarPorPlaca(String placa);

    //3) Editar vehículo
    Vehiculo editarVehiculo(Vehiculo vehiculoAEditar);

    //4) Listar vehículos
    List<Vehiculo> listarVehiculos();

    //5) Eliminar vehículos
    void eliminarVehiculo(Integer id);

}
