package co.edu.udec.act3.jonnyluna.vehiculos.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @Column(name = "cedula", nullable = false)
    private Integer cedula;
    @Column(name = "clave")
    private String clave;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "genero", nullable = false)
    private String genero;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "rol")
    private String rol;
    @JsonManagedReference
    @OneToMany(mappedBy = "usuario",fetch=FetchType.LAZY)
    private List<Vehiculo> vehiculos;
}
