package edu.pe.trentino.services;

import edu.pe.trentino.dto.StudentDto;
import edu.pe.trentino.entidad.Student;

import java.util.List;

public interface StudentService {
    void addStudent(StudentDto dto);
    List<Student> getAllStudents();
}
