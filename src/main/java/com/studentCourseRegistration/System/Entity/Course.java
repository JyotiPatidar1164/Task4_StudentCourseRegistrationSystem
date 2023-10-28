package com.studentCourseRegistration.System.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Course")
	public class Course {
	

	 


		public int getCourse_Code() {
		return course_Code;
	}


	public void setCourse_Code(int course_Code) {
		this.course_Code = course_Code;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getCapacity() {
		return capacity;
	}


	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}


	public java.sql.Time getSchedule() {
		return schedule;
	}


	public void setSchedule(java.sql.Time schedule) {
		this.schedule = schedule;
	}


		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	     private int course_Code;

	  
	    private String title;

	   
	    private String description;

	  
	    private Integer capacity;

	  
	    private java.sql.Time schedule;

	    

	

}
