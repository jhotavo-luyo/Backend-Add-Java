package edu.pe.trentino.services;


import edu.pe.trentino.dto.VehiculoDto;
import edu.pe.trentino.entidad.Vehiculo;
import edu.pe.trentino.repository.VehiculoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VehiculoServiceImpl implements VehiculoService{

    private final VehiculoRepository vehiculoRepository;

    @Override
    public void registrarVehiculo(VehiculoDto dto){
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setPlaca(dto.getPlaca());
        vehiculo.setColor(dto.getColor());
        vehiculo.setModelo(dto.getModelo());
        vehiculo.setAnio(dto.getAnio());
        vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> obtenerVehiculo(){
        return vehiculoRepository.findAll();
    }
}
