package edu.pe.trentino.dto;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private String name;
    private String description;
    private double price;
    private int stock;
}
