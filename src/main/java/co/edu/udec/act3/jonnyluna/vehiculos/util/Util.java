package co.edu.udec.act3.jonnyluna.vehiculos.util;

import co.edu.udec.act3.jonnyluna.vehiculos.domain.response.VehiculoResponse;
import co.edu.udec.act3.jonnyluna.vehiculos.model.Vehiculo;

public class Util {
    public static VehiculoResponse mapToVehiculoResponse(Vehiculo vehiculo){
        return VehiculoResponse.builder()
                        .placa(vehiculo.getPlaca())
                        .marca(vehiculo.getMarca())
                        .color(vehiculo.getColor())
                        .modelo(vehiculo.getModelo())
                        .numPuestos(vehiculo.getNumPuestos())
                        .cilindraje(vehiculo.getCilindraje())
                        .build();
    }
}
