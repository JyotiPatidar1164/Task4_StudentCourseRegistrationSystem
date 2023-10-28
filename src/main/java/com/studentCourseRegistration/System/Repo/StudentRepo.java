package com.studentCourseRegistration.System.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.studentCourseRegistration.System.Entity.Student;

import jakarta.transaction.Transactional;

public interface StudentRepo extends JpaRepository<Student, Integer>{

	
	@Modifying
	@Transactional
	@Query(value="delete  from Student where registration_Course= :id",nativeQuery=true)
	void deleteStudent(@Param("id")int id);
	
	

	
	
	

	@Query(value="select * from Student where registration_Course=:id",nativeQuery=true)
	List<Student> getStudentsForCourse(@Param("id")int id);
	

}
