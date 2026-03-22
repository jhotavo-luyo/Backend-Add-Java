package edu.pe.trentino.services;

import edu.pe.trentino.dto.UserDto;
import edu.pe.trentino.entidad.User;

import java.util.List;

public interface UserService {
    void createUser(UserDto dto);
    List<User> findAllUsers();
}
