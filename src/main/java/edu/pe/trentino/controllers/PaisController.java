package edu.pe.trentino.controllers;

import edu.pe.trentino.dto.PaisDto;
import edu.pe.trentino.entidad.Pais;
import edu.pe.trentino.services.PaisServiceImpl;
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
public class PaisController {
    private final PaisServiceImpl paisService;


    @GetMapping("/paises")
    public ResponseEntity<?> getPaises() {
        List<Pais> paises = paisService.obtenerPaises();
        return ResponseEntity.ok(paises);
    }

    @PostMapping("/pais")
    public ResponseEntity<?> savePais(@RequestBody PaisDto dto){
        paisService.crearPais(dto);
        return ResponseEntity.ok(Collections.singletonMap("message", "Pais creado correctamente"));
    }
}
