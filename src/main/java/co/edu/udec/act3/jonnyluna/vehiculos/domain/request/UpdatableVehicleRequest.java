package co.edu.udec.act3.jonnyluna.vehiculos.domain.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdatableVehicleRequest {
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private Integer numPuestos;
    private String cilindraje;

}
