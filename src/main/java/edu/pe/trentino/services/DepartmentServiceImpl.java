package edu.pe.trentino.services;

import edu.pe.trentino.dto.DepartmentDto;
import edu.pe.trentino.entidad.Department;
import edu.pe.trentino.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public void createDepartment(DepartmentDto dto) throws Exception {
        var getDepartment = departmentRepository.getByName(dto.getName());
        if (getDepartment.isEmpty()) throw new Exception("El nombre no debe estar vacio");

        var department = new Department();
        department.setName(dto.getName());
        departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll().stream().toList();
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public void updateDepartment(Long id, DepartmentDto dto) {
        //TODO verificar si existe el department
        var getDepartment = departmentRepository.findById(id);
        if (getDepartment.isPresent()) {
            Department dep = new Department();
            dep.setId(getDepartment.get().getId());
            dep.setName(dto.getName());
            departmentRepository.save(dep);
        }
    }
}
