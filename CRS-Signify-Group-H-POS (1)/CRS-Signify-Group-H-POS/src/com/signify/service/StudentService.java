/**
 * 
 */
package com.signify.service;

import java.util.*;

import com.signify.collection.DatabaseCollection;
import com.signify.dao.StudentDAO;
import com.signify.dao.UserDAOImplementation;
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
		System.out.print("Enter Student father name: ");
		String fathername = in.next();

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
		String role="student";
		System.out.print("Enter Semester: ");
		int semester = in.nextInt();
		
		
		StudentDAO unew= new StudentDAO();
		int isapproved = 0;
		unew.create_student(studentId,studentName,studentAge ,department,semester,stpass,  isapproved,fathername);
		
		
		//StudentDAOImplementation unew= new UserDAOImplementation();
		//unew.create_user(studentId,stpass,studentName,role);
		

//		Student st = new Student();
//		st.setId(studentId);
//		st.setAge(studentAge);
//		st.setName(studentName);
//		st.setDepartment(department);
//		st.setSemester(semester);
//		st.setPassword(stpass);

		// adding the student object to the students list

//		if (DatabaseCollection.students.add(st))
//			System.out.println("your registration is successful");
//
//		else
//			System.out.println("registration failed");
//
//		System.out.println("\n\n" + "+++++Registered Students Details++++");
//
//		for (Student s : DatabaseCollection.students) {
//			System.out.print(
//					s.getName() + " " + s.getId() + " " + s.getAge() + " " + s.getDepartment() + " " + s.getSemester());
//			System.out.println();
//		}
//
//		System.out.println("\n\n");

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
	public void exit() {
		//CRSApplicationMenu.Menu();
	}

}
