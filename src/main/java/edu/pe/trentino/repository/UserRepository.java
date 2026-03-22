package edu.pe.trentino.repository;

import edu.pe.trentino.entidad.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
