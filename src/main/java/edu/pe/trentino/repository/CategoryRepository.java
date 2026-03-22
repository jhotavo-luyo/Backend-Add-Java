package edu.pe.trentino.repository;

import edu.pe.trentino.entidad.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
