package edu.pe.trentino.services;

import edu.pe.trentino.dto.StudentDto;
import edu.pe.trentino.entidad.Student;
import edu.pe.trentino.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void addStudent(StudentDto studentDto) {
        var student = new Student();
        student.setFirstname(studentDto.getFirstname());
        student.setLastname(studentDto.getLastname());
        student.setDni(studentDto.getDni());
        student.setEmail(studentDto.getEmail());
        student.setPhone(studentDto.getPhone());
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
