package edu.pe.trentino.services;

import edu.pe.trentino.dto.ProductDto;
import edu.pe.trentino.entidad.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    void addProduct(ProductDto productDto) throws Exception;
    List<Product> getAllProducts();
    Optional<Product> getOneProduct(Long id);
    void deleteProduct(Long id);
    void updateProduct(Long id, ProductDto productDto);
    Optional<Product> totalPrice(ProductDto productDto);
}
