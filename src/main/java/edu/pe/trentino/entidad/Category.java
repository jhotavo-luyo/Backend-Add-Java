package edu.pe.trentino.entidad;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "categories")
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false, unique = true)
    private String slug;
    @Column()
    private LocalDateTime createdAt;
    @Column()
    private LocalDateTime updatedAt;
    @Column()
    private LocalDateTime deletedAt;
}
