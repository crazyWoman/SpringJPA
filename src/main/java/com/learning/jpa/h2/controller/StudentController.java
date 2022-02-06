package com.learning.jpa.h2.controller;

import com.learning.jpa.h2.model.Students;
import com.learning.jpa.h2.respository.JpaStudentRepository;
import com.learning.jpa.h2.respository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRespository jpaStudentRepository;

    @GetMapping("/studentLastName/{lastName}")
    public List<Students> getEmployeeById(@PathVariable ("lastName") final String lastName){
        return jpaStudentRepository.findStudentsByLastName(lastName);
    }




}
