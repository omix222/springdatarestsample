package com.example.springdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students") Iterable<Student> getStudents() {
        return studentRepository.findAll();
    }
}
