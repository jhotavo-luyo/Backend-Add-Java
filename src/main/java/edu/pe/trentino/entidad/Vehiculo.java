package edu.pe.trentino.entidad;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "vehiculos")
@Builder
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String placa;

    @Column(length = 50, nullable = false)
    private String color;

    @Column(length = 50, nullable = false)
    private String modelo;

    @Column(length = 50, nullable = false)
    private int anio;

}
