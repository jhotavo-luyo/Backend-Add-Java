package edu.pe.trentino.services;

import edu.pe.trentino.dto.VehiculoDto;
import edu.pe.trentino.entidad.Vehiculo;

import java.util.List;

public interface VehiculoService {

    void registrarVehiculo(VehiculoDto dto);

    List<Vehiculo> obtenerVehiculo();

}
