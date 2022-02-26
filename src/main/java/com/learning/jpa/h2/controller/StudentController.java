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
        //return jpaStudentRepository.findStudentsByLastName(lastName);
    	return jpaStudentRepository.findFirst2StudentsByLastName(lastName);
    }

    @GetMapping("/studentLastName/{lastName}/{firstName}")
    public List<Students> getByLastNameAndFirstName(@PathVariable final String lastName,
    									  @PathVariable final String firstName){
        //return jpaStudentRepository.findStudentsByLastName(lastName);
    	return jpaStudentRepository.findStudentsByLastNameAndFirstName(lastName, firstName);
    }

    @GetMapping("/studentLastNameOrFirstName/{lastName}/{firstName}")
    public List<Students> getByLastNameOrFirstName(@PathVariable final String lastName,
    									  @PathVariable final String firstName){
        //return jpaStudentRepository.findStudentsByLastName(lastName);
    	return jpaStudentRepository.findStudentsByLastNameOrFirstName(lastName, firstName);
    }

    @GetMapping("/studentsByCountriesCount/{count}")
    public List<Students> getByLastNameOrFirstName(@PathVariable final int count){
        //return jpaStudentRepository.findStudentsByLastName(lastName);
    	return jpaStudentRepository.findStudentsByCountriesCountryIdGreaterThan(count);
    }
    
    @GetMapping("/studentsFirstNameLike/{filter}")
    public List<Students> getByFirstNameLike(@PathVariable final String filter){
        //return jpaStudentRepository.findStudentsByLastName(lastName);
    	return jpaStudentRepository.findStudentsByFirstNameLike(filter);
    }
    
    @GetMapping("/studentsFindByLastNameOrderByFirstNameDesc/{lastName}")
    public List<Students> getByLastNameOrderByFirstNameDesc(@PathVariable final String lastName){
        //return jpaStudentRepository.findStudentsByLastName(lastName);
    	return jpaStudentRepository.findStudentsByLastNameOrderByFirstNameDesc(lastName);
    }
    
}
