package com.learning.jpa.h2.respository;

import com.learning.jpa.h2.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JpaCustomStudentRepository extends JpaRepository<Students,Integer> {
    @Query(
            "from Students stud where stud.lastName = :lastname and" +
                    " stud.firstName like :firstLetter% " +
                    " and stud.studentId = :studntid")
    List<Students> findStudent(String firstLetter, String lastname, int studntid);
}
