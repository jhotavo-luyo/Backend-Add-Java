package edu.pe.trentino.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaisDto {
    private String nombre;
    private String descripcion;
    private String codigoPostal;
    private String ubigeo;
}
