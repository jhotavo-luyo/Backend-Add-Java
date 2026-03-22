package edu.pe.trentino.repository;

import edu.pe.trentino.entidad.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Optional<Department> getByName(String name);
}
