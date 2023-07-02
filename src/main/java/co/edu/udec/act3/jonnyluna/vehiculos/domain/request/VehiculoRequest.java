package co.edu.udec.act3.jonnyluna.vehiculos.domain.request;

import co.edu.udec.act3.jonnyluna.vehiculos.model.Usuario;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class VehiculoRequest {
    private String placa;
    private String marca;
    private String modelo;
    private String version;
    private String color;
    private Integer numPuestos;
    private Integer numPuertas;
    private String combustible;
    private Integer kilometros;
    private String cilindraje;
    private String categoria;
    private Integer cedulaUsuario;
}
