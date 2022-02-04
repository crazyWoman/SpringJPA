package com.learning.jpa.h2.respository;

import com.learning.jpa.h2.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRespository extends JpaStudentRepository,JpaRepository<Students,Integer> {
    @Override
    public List<Students> findStudentsByLastname(String lastname);
}
