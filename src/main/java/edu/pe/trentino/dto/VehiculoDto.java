package edu.pe.trentino.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehiculoDto {

    private String placa;
    private String color;
    private String modelo;
    private int anio;

}
