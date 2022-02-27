package com.learning.jpa.h2.respository;

import com.learning.jpa.h2.model.Students;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface JpaStudentRepository {
    List<Students> findByLastName(String lastName);

}
