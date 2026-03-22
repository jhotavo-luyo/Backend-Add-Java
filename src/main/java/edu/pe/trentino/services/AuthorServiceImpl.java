package edu.pe.trentino.services;

import edu.pe.trentino.dto.AuthorDto;
import edu.pe.trentino.entidad.Author;
import edu.pe.trentino.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void createAuthor(AuthorDto dto) {
        //Crear un nuevo objeto Author
        Author author = crearAutor(dto);
        authorRepository.save(author);
    }

    private Author crearAutor(AuthorDto dto) {
        //Crear una nueva instancia de author
        Author author = new Author();
        author.setNombres(dto.getNombres());
        author.setApellidos(dto.getApellidos());
        author.setEmail(dto.getEmail());
        author.setEdad(dto.getEdad());
        author.setCreatedAt(LocalDateTime.now());

        return author;
    }

    @Override
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
}
