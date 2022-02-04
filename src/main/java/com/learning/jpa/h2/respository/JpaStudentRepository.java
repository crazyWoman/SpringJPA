package com.learning.jpa.h2.respository;

import com.learning.jpa.h2.model.Students;

import java.util.List;

public interface JpaStudentRepository {
    List<Students> findStudentsByLastName(String lastName);
}
