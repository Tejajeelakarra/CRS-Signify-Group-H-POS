/**
 * 
 */
package com.signify.service;

/**
 * @author WELCOME
 *
 */
public class StudentService {
     public void changePassword(int studentId) {
    	System.out.println("password is changed"); 
    	 
     }
     
     public  void register(int studentId) {
    	 System.out.println("your registeration is successful");
    	 
     }
     
     public void viewGradeCard(int studentId) {
    	 System.out.println("Grade card is shown below");
    	 
     }
     public void addCourse(String courseCode) {
 		System.out.println("Course is added");
 	}
 	public void dropCourse(String courseCode) {
 		System.out.println("Course is deleted");
 	}
 	public void payfees(int studentId) {
 		System.out.println("fees is paid");
 	}
 	public void viewCourseDetails() {
		System.out.println("Course details viewed");
		
	}
 	public void viewRegisteredCourses() {
		System.out.println("Registered courses viewed");
	}
}
