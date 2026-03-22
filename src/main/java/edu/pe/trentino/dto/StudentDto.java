package edu.pe.trentino.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private String firstname;
    private String lastname;
    private Integer dni;
    private String email;
    private String phone;
}
