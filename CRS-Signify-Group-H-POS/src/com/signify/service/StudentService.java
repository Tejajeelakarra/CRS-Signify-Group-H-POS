/**
 * 
 */
package com.signify.service;

import java.util.*;

import com.signify.collection.Student;

public class StudentService implements StudentInterface {
	
	private static List<Student> students = new ArrayList<>();

	public void register() {
		Scanner in = new Scanner(System.in);
		System.out.println("--------REGESTRATION FOR STUDENT-------- ");

		System.out.println("+++++Enter Your Details++++++");
		System.out.print("Enter Student ID: ");
		int studentId = in.nextInt();

		System.out.print("Enter Student name: ");
		String studentName = in.next();

		System.out.print("Enter Your Age: ");
		int studentAge = in.nextInt();

		System.out.print("Enter Your Department: ");
		String department = in.next();

		System.out.print("Enter Semester: ");
		int semester = in.nextInt();

//		System.out.println("Student ID: " + studentId);
//		System.out.println("Student Name: " + studentName);
//		System.out.println("Age: " + studentAge);
//		System.out.println("Department: " + department);
//		System.out.println("Semester: " + semester);
		
		//creating student object 
		Student st = new Student();
		st.setId(studentId);
		st.setAge(studentAge);
		st.setName(studentName);
		st.setDepartment(department);
		st.setSemester(semester);
		
		
		//adding the student object to the students list
		
		if (students.add(st))
			System.out.println("your registration is successful");
		
		else
			System.out.println("registration failed");
		
		
		
		System.out.println("\n\n" + "+++++Registered Students Details++++");
		
		for (Student s : students) {
			System.out.print(s.getName() + " " + s.getId() + " " + s.getAge() + " " + s.getDepartment() + " " + s.getSemester());
			System.out.println();
		}
		
		System.out.println("\n\n");

//		System.out.println("Request sent");
//		System.out.println("Notification will be sent once approved");

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
