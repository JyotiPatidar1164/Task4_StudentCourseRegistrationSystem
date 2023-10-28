package com.studentCourseRegistration.System.Repo;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.studentCourseRegistration.System.Entity.Course;


import jakarta.transaction.Transactional;

public interface Repository extends JpaRepository<Course, Integer> {
	@Modifying 
	@Transactional
  @Query(value="update Course as c set capacity= capacity-1 where c.course_Code= :id",nativeQuery=true)
	void capacity(@Param("id")int registrationCourse);

	@Query(value="select capacity from Course where course_Code=:id",nativeQuery=true)
	int checkCapacity(@Param("id") int i);


	
	


	

	

	

	
	
	

}
