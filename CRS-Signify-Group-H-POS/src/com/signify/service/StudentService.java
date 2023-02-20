/**
 * 
 */
package com.signify.service;

import java.util.*;

import com.signify.collection.DatabaseCollection;
import com.signify.bean.Student;
//import DatabaseCollection.students;
public class StudentService implements StudentInterface {
	Scanner in = new Scanner(System.in);
	//private static List<Student> students = new ArrayList<>();
	public void studentMenu() {
		System.out.println("--------WELCOME TO STUDENT-------- ");
		System.out.println("\t1.VIEW GRADE CARD\n" + "\t2.ADD COURSE\n" + "\t3.DROP COURSE\n"
				+ "\t4.PAY FEES\n" + "\t5.VIEW COURSE DETAILS\n" + "\t6.VIEW REGISTERED COURSE\n"
				+ "\t7.UPDATE DETAILS\n" + "\t8.EXIT\n");
		System.out.print("Enter your option no.: ");
		int i3 = in.nextInt();
		if (i3 == 8) {
			// Menu();
		}
	}
	public void login() {
		System.out.println("--------LOGIN PAGE-------- ");
        System.out.print("Enter user name: ");    
        String name = in.next();   
        //System.out.println("Name: " + name);
        System.out.print("Enter your Password: ");    
        String pass = in.next();   
        //System.out.println("Password: " + pass); 
        //System.out.print("choose user role: \n");
        System.out.println("Name: " + name);
        System.out.println("Password: " + pass);
        for(Student st:DatabaseCollection.students) {
        	if (st.getName().equals(name)) {
        		String p = st.getPassword();
        		//System.out.println("password: " + p);
        		if(p.equals(pass)) {
        		studentMenu();
        		}
        		else {
            		System.out.println("INVALID USERNAME OR PASSWORD");
            		login();
            		break;
        	}

        }
        }
        
    	
	
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
		String stpass=in.next();
		
		System.out.println("Confirm your password: ");
		String stpass2=in.next();
		
		if(!stpass.equals(stpass2)) {
			System.out.println("RE ENTTER THE PASSWORD");
			register();
		}
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
		st.setPassword(stpass);
		
		
		//adding the student object to the students list
		
		if (DatabaseCollection.students.add(st))
			System.out.println("your registration is successful");
		
		else
			System.out.println("registration failed");
		
		
		
		System.out.println("\n\n" + "+++++Registered Students Details++++");
		
		for (Student s : DatabaseCollection.students) {
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
