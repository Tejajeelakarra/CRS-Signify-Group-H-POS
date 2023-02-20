/**
 * 
 */
package com.signify.client;

import java.util.Scanner;

import com.signify.service.StudentInterface;
import com.signify.service.StudentService;
import com.signify.service.UserService;

public class CRSStudentMenu{

	public static void mainMenu() {
		
		StudentService studentService = new StudentService();
		
		studentService.studentMenu();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Select your option: ");
		int option = in.nextInt();
		
		int studentId = 1;
		String courseCode = "CS6107";
		
		switch(option) {
		
			case 1:
				studentService.viewGradeCard(studentId);
				break;
			case 2:
				studentService.addCourse(courseCode);
				break;
			case 3:
				studentService.dropCourse(courseCode);
				break;
			case 4:
				studentService.payfees(studentId);
				break;
			case 5:
				studentService.viewCourseDetails();
				break;
			case 6:
				studentService.viewRegisteredCourses();
				break;
			case 7:
				UserService userService = new UserService();
				userService.updateDetails(studentId);
				break;
			case 8:
				//CRSApplicationMenu.Menu();
				studentService.exit();
				break;
			default:
				System.out.println("Select correct option...");
			
		}
	}
	
	
	public static void main(String[] args) {

	}

}
