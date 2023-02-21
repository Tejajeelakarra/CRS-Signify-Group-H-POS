/**
 * 
 */
package com.signify.service;

import java.util.*;

import com.signify.collection.DatabaseCollection;
import com.signify.bean.Course;
import com.signify.bean.Student;
import com.signify.client.CRSApplicationMenu;

//import DatabaseCollection.students;
public class StudentService implements StudentInterface {
	Scanner in = new Scanner(System.in);

	// private static List<Student> students = new ArrayList<>();
	public void studentMenu() {
		System.out.println("--------WELCOME TO STUDENT-------- ");
		System.out.println("\t1.VIEW GRADE CARD\n" + "\t2.ADD COURSE\n" + "\t3.DROP COURSE\n" + "\t4.PAY FEES\n"
				+ "\t5.VIEW COURSE DETAILS\n" + "\t6.VIEW REGISTERED COURSE\n" + "\t7.UPDATE DETAILS\n" + "\t8.EXIT\n");
		System.out.print("Enter your option no.: ");
	}

	public void register() {
		Scanner in = new Scanner(System.in);
		System.out.println("--------REGESTRATION FOR STUDENT-------- ");

		System.out.println("+++++Enter Your Details++++++");
		System.out.print("Enter Student ID: ");
		int studentId = in.nextInt();

		System.out.print("Enter Student name: ");
		String studentName = in.next();

		System.out.println("Enter your password: ");
		String stpass = in.next();

		System.out.println("Confirm your password: ");
		String stpass2 = in.next();

		if (!stpass.equals(stpass2)) {
			System.out.println("RE ENTTER THE PASSWORD");
			register();
		}
		System.out.print("Enter Your Age: ");
		int studentAge = in.nextInt();

		System.out.print("Enter Your Department: ");
		String department = in.next();

		System.out.print("Enter Semester: ");
		int semester = in.nextInt();

		// adding the student object to the students list
		System.out.println("your registration is successful");
		//System.out.println("Waiting for admin approval..");
		//AdminService admin = new AdminService();
		//admin.approveStudent( studentId, studentAge, studentName, department, semester, stpass);
		
		Student st = new Student();
		st.setId(studentId);
		st.setAge(studentAge);
		st.setName(studentName);
		st.setDepartment(department);
		st.setSemester(semester);
		st.setPassword(stpass);
		
		DatabaseCollection.students.add(st);
		System.out.println("\n\n" + "+++++Registered Students Details++++");

		for (Student s : DatabaseCollection.students) {
			System.out.print(
					s.getName() + " " + s.getId() + " " + s.getAge() + " " + s.getDepartment() + " " + s.getSemester());
			System.out.println();
		}

		System.out.println("\n\n");

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
		for (Course course : DatabaseCollection.courses) {
			System.out.println(course.getCourseCode() + " " + course.getName() + " " + course.getIsOffered() + " " + course.getInstructor());
		}
		System.out.println("Course details viewed");

	}

	public void viewRegisteredCourses() {
		System.out.println("Enter the course to register: ");
		Course course = new Course();
		
		Scanner in = new Scanner(System.in);
		
	    viewCourseDetails();
	    System.out.println("Enter course code: ");
	    String ccode=in.next();
//	    System.out.println("Enter course name:");
//	    String cname=in.next();
//	    System.out.println("Wheather course is offered or not:");
//	    String isoffer=in.next();
//	    System.out.println("Enter the Instructor:");
//	    String instructor1=in.next();
//	    
	    
	   course.setCourseCode(ccode);
//	   course.setInstructor(instructor1);
//	   course.setIsOffered(null);
//	   course.setName(cname);
	   
	   
	   DatabaseCollection.courses.add(course);
		System.out.println("Registered courses viewed");
	}
	public void exit() {
		//CRSApplicationMenu.Menu();
	}

}
