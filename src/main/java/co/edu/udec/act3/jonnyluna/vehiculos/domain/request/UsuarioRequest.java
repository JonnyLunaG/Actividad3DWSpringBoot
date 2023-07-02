package co.edu.udec.act3.jonnyluna.vehiculos.domain.request;

import lombok.Data;

@Data
public class UsuarioRequest {
    private Integer cedula;
    private String clave;
    private String nombre;
    private String apellido;
    private String genero;
    private String email;
}
