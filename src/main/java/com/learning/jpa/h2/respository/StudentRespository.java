package com.learning.jpa.h2.respository;

import com.learning.jpa.h2.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRespository extends JpaRepository<Students,Integer> {

    public List<Students> findStudentsByLastName(String lastName);
    
    public List<Students> findFirst2StudentsByLastName(String lastName);
    
    public List<Students> findStudentsByLastNameAndFirstName(String lastName, String firstName);
    
    public List<Students> findStudentsByLastNameOrFirstName(String lastName, String firstName);
    
    public List<Students> findStudentsByCountriesCountryIdGreaterThan(int countryId);
    
    public List<Students> findStudentsByFirstNameLike(String filter);
    
    public List<Students> findStudentsByLastNameOrderByFirstNameDesc(String lastName);
    public List<Students> findStudentsByLastNameIgnoreCase(String lastName);
}
