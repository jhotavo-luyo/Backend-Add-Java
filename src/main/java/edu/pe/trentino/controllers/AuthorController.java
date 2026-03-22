package edu.pe.trentino.controllers;

import edu.pe.trentino.dto.AuthorDto;
import edu.pe.trentino.entidad.Author;
import edu.pe.trentino.services.AuthorService;
import edu.pe.trentino.services.AuthorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorServiceImpl authorService;

    @GetMapping("authors")
    public ResponseEntity<?> getAuthors() {
        List<Author> authors = authorService.findAllAuthors();
        return ResponseEntity.ok(authors);
    }

    @PostMapping("/author")
    public ResponseEntity<?> saveAuthor(@RequestBody AuthorDto dto) {
        authorService.createAuthor(dto);
        return ResponseEntity.ok(Collections.singletonMap("message", "Se guardo"));
    }
}
