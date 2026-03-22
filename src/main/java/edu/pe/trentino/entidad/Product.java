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
@Builder
@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String slug;
    @Column(length = 1000)
    private String description;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private int stock;
    @Column()
    private boolean inOffer = false;
    @Column()
    private LocalDateTime createdAt;
    @Column()
    private LocalDateTime updatedAt;
    @Column()
    private LocalDateTime deletedAt;
}
