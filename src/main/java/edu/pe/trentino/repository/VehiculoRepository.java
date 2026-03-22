package edu.pe.trentino.repository;

import edu.pe.trentino.entidad.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
}
