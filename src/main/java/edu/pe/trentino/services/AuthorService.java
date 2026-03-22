package edu.pe.trentino.services;

import edu.pe.trentino.dto.AuthorDto;
import edu.pe.trentino.entidad.Author;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

//@Service
public interface AuthorService {

    /*private final List<AuthorDto> authors = Arrays.asList(
        new AuthorDto(1L, "Leo", "Perez", "lperez@gmail.com", 23),
        new AuthorDto(2L, "Jhon", "Doe", "jhon@gmail.com", 23),
        new AuthorDto(3L, "Bell", "Dayly", "bell@gmail.com", 23)
    );*/

    /*public List<AuthorDto> getAuthors() {
        return authors;
    }*/

    //nos va permitir crear el autor en la tabla
    void createAuthor(AuthorDto dto);

    //permite obtener todos los autores de la bd
    List<Author> findAllAuthors();
}
