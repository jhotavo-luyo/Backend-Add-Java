package edu.pe.trentino.services;

import edu.pe.trentino.dto.PaisDto;
import edu.pe.trentino.entidad.Pais;
import edu.pe.trentino.repository.PaisRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PaisServiceImpl implements PaisService {

    private final PaisRepository paisRepository;

    @Override
    public void crearPais(PaisDto dto) {
        var pais = new Pais();
        pais.setNombre(dto.getNombre());
        pais.setDescripcion(dto.getDescripcion());
        pais.setUbigeo(dto.getUbigeo());
        pais.setCodigoPostal(dto.getCodigoPostal());
        paisRepository.save(pais);
    }

    @Override
    public List<Pais> obtenerPaises() {
        return paisRepository.findAll().stream().toList();
    }
}
