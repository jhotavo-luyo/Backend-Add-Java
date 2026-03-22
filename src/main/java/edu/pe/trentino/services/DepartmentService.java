package edu.pe.trentino.services;

import edu.pe.trentino.dto.DepartmentDto;
import edu.pe.trentino.entidad.Department;

import java.util.List;

public interface DepartmentService {
    //TODO registrar en bd un departamento
    void createDepartment(DepartmentDto dto) throws Exception;
    //TODO: obtener todo los departamentos de bd
    List<Department> getAllDepartments();
    //TODO eliminar un department
    void deleteDepartment(Long id);
    //TODO actualizar un departmento
    void updateDepartment(Long id, DepartmentDto dto);
}
