package edu.pe.trentino.repository;

import edu.pe.trentino.entidad.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
