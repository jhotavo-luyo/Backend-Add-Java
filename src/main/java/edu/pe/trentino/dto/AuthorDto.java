package edu.pe.trentino.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {
    private Long id;
    private String nombres;
    private String apellidos;
    private String email;
    private int edad;
}
