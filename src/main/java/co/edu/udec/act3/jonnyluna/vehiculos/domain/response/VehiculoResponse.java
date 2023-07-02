package co.edu.udec.act3.jonnyluna.vehiculos.domain.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class VehiculoResponse {
    private String placa;
    private String marca;
    private String modelo;
    private String cilindraje;
    private Integer numPuestos;
    private String color;
}
