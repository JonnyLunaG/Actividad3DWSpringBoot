package co.edu.udec.act3.jonnyluna.vehiculos.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "vehiculos")
public class Vehiculo {
    @Id
    @Column(name = "id_vehiculo", nullable = false)
    private Integer id_vehiculo;
    @Column(name = "placa", nullable = false)
    private String placa;
    @Column(name = "marca", nullable = false)
    private String marca;
    @Column(name = "modelo", nullable = false)
    private String modelo;
    @Column(name = "version", nullable = false)
    private String version;
    @Column(name = "color", nullable = false)
    private String color;
    @Column(name = "num_puestos", nullable = false)
    private Integer numPuestos;
    @Column(name = "num_puertas", nullable = false)
    private Integer numPuertas;
    @Column(name = "combustible", nullable = false)
    private String combustible;
    @Column(name = "kilometros", nullable = false)
    private Integer kilometros;
    @Column(name = "cilindraje", nullable = false)
    private String cilindraje;
    @Column(name = "categoria", nullable = false)
    private String categoria;
    @JsonBackReference
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;









}
