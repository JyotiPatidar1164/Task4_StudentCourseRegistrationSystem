package com.studentCourseRegistration.System.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
	

	@Entity
	@Table(name="Student")
	//@Data
	public class Student {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "student_Id")
	    private int studentId;

	   
	     @Column(name = "student_Name")
	     private String studentName;

    //@ManyToOne
 // @JoinColumn(name = "registration_Course")

public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public int getRegistrationCourse() {
			return registrationCourse;
		}

		public void setRegistrationCourse(int registrationCourse) {
			this.registrationCourse = registrationCourse;
		}

private int registrationCourse;

	   

	
	
	
}
