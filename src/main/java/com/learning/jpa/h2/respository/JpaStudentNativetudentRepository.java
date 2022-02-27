package com.learning.jpa.h2.respository;

import com.learning.jpa.h2.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JpaStudentNativetudentRepository
    extends JpaRepository<Students,Integer>

    {
        @Query(
                value = "SELECT * FROM TBL_STUDENTS STUD WHERE STUD.LAST_NAME = :lastName " +
                        " AND STUD.FIRST_NAME LIKE :firstLetter% " +
                        " AND STUD.ID = :studntid",
                nativeQuery = true
        )
        List<Students> findStudent(String lastName, String firstLetter, int studntid);
}
