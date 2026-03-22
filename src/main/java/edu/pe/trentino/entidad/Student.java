package edu.pe.trentino.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String firstname;

    @Column(length = 100, nullable = false)
    private String lastname;

    @Column(nullable = false, unique = true)
    private Integer dni;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(length = 15, nullable = false)
    private String phone;
}
