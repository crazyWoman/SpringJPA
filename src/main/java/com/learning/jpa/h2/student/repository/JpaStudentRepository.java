package com.learning.jpa.h2.student.repository;

import com.learning.jpa.h2.model.Students;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface JpaStudentRepository {
    List<Students> findByLastName(String lastName);
    
    List<Students> findStudent(String firstLetterInFirstName,
    						   String lastName, int countryID);
}
