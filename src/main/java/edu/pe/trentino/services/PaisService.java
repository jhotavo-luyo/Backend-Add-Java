package edu.pe.trentino.services;

import edu.pe.trentino.dto.PaisDto;
import edu.pe.trentino.entidad.Pais;

import java.util.List;

public interface PaisService {
    void crearPais(PaisDto dto);
    List<Pais> obtenerPaises();
}
