package com.project.webapp.service;

import com.project.webapp.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface StudentService {

    Optional<Student> getStudent(Integer studentId);
    Student setStudent(Student student);
    void deleteStudent(Integer studentId);
    Page<Student> getStudent(Pageable pageable);
    Page<Student> searchByImie(String imie, Pageable pageable);

}