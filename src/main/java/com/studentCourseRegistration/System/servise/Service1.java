package com.studentCourseRegistration.System.servise;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentCourseRegistration.System.Entity.Course;
import com.studentCourseRegistration.System.Entity.Student;
import com.studentCourseRegistration.System.Repo.Repository;
import com.studentCourseRegistration.System.Repo.StudentRepo;
@Service
public class Service1 {
	@Autowired
	private Repository obj;
	
	@Autowired 
	private StudentRepo obj2;

	

	public List<Course> getAllCourse() {
		
		List<Course> list=obj.findAll();
	
		return list;
	}



	public String setdata(Course course) {
		
		obj.saveAndFlush(course);
		return "Course Registered successfully";
	}



	public List<Student> deleteCousrse(int id) {
		
		
		List<Student> students =obj2.getStudentsForCourse(id);
		System.out.println(students);
		obj2.deleteStudent(id);
		System.out.println("students33");
		obj.deleteById(id);
		return students;
	}



	public List<Student> getAllStudent() {
		
		List<Student> list=obj2.findAll();
		return list;
	}



	public String setStudent(Student student) {
	    // Check if the course with the specified ID exists
	    Optional<Course> courseOptional = obj.findById(student.getRegistrationCourse());

	    if (courseOptional.isPresent()) {
	    	 int c =obj.checkCapacity(student.getRegistrationCourse());
	    	 System.out.println(c);
	    	 if(c<=0)
	    	 {
	    		return "Course capacity if full"; 
	    	 }
	    	 else {
	    	  obj.capacity(student.getRegistrationCourse());
	     
	        obj2.saveAndFlush(student);
	      
	        return "Student register successfully in course ";
	    	 }
	    } else {
	       
	        return "Course is not available";
	    }
	}


}
