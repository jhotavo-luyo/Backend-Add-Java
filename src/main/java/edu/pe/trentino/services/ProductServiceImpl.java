package edu.pe.trentino.services;

import edu.pe.trentino.dto.ProductDto;
import edu.pe.trentino.entidad.Product;
import edu.pe.trentino.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(ProductDto productDto) throws Exception {

        if (productDto.getName().isEmpty()) {
            throw new Exception("EL nombre del producto no puede estar vacio");
        }

        var product = new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setStock(productDto.getStock());
        product.setCreatedAt(LocalDateTime.now());
        productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll().stream().toList();
    }

    @Override
    public Optional<Product> getOneProduct(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void deleteProduct(Long id) {
        var getProduct = getOneProduct(id);
        if (getProduct.isPresent()) {
            System.out.println("Product no exist");
        }
        productRepository.deleteById(id);
    }

    @Override
    public void updateProduct(Long id, ProductDto productDto) {
        var product = new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setStock(productDto.getStock());
        product.setUpdatedAt(LocalDateTime.now());
        productRepository.save(product);
    }

    @Override
    public Optional<Product> totalPrice(ProductDto productDto) {
        return Optional.empty();
    }
}
