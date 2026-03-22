package edu.pe.trentino.controllers;

import edu.pe.trentino.dto.VehiculoDto;
import edu.pe.trentino.entidad.Vehiculo;
import edu.pe.trentino.services.VehiculoServiceImpl;
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
public class VehiculoController {

    private final VehiculoServiceImpl vehiculoService;

    @GetMapping("vehiculos")
    public ResponseEntity<?> getVehiculos(){
        List<Vehiculo> vehiculos = vehiculoService.obtenerVehiculo();
        return ResponseEntity.ok(vehiculos);
    }

    @PostMapping("/vehiculo")
    public ResponseEntity<?> saveVehiculo(@RequestBody VehiculoDto dto){
        vehiculoService.registrarVehiculo(dto);
        return ResponseEntity.ok(Collections.singletonMap("message", "Se guardo"));
    }

}
