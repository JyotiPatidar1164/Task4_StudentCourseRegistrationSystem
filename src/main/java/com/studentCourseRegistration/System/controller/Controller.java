package com.studentCourseRegistration.System.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentCourseRegistration.System.Entity.Course;
import com.studentCourseRegistration.System.Entity.Student;
import com.studentCourseRegistration.System.servise.Service1;

@RestController
public class Controller {
	@Autowired
	private Service1 ser;
	
	
	
	 
	@GetMapping("/get")
	public List<Course> getdata()
	{
 List<Course> list=ser.getAllCourse();
 return list;
	}

	@PostMapping("/post")
	public String setdata(@RequestBody Course course)
	
	{
		String response =ser.setdata(course);
		return response;
		
	}
	
	 @DeleteMapping("/delete/{course_Id}")
	 public String deleteCousrse(@PathVariable("course_Id") int id)
	

	 {
			System.out.println("controller1");
		List<Student> students=ser.deleteCousrse(id);
		System.out.println("controller");

		return "Course removed Successfully";
				
		 
		 
	 }
		@GetMapping("/Student_Get")
		public List<Student> student_getdata()
		{
	 List<Student> list=ser.getAllStudent();
	 System.out.println(list);
	 return list;
		}
		
		@PostMapping("/Student_post")
		public String setdata(@RequestBody Student student)
		
		{
			
			
			String response = ser.setStudent(student);
			return response;
				
			
		}


		
		


}
