package com.learning.jpa.h2.student.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.learning.jpa.h2.model.Students;

import java.util.List;

@Repository
public interface JPQLCustomStudentRepository extends JpaRepository<Students, Integer> {
	@Query("from Students student where student.lastName =:lastName and"
			+ " student.firstName like :firstLetterInFirstName% and"
			+ " student.studentId =:studentID")
	List<Students> findStudent(String firstLetterInFirstName,
			   String lastName, int studentID);
}
