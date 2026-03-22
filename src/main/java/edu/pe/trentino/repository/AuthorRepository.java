package edu.pe.trentino.repository;

import edu.pe.trentino.entidad.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
