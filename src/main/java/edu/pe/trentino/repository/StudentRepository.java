package edu.pe.trentino.repository;

import edu.pe.trentino.entidad.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
