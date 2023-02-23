/**
 * 
 */
package com.signify.service;

import java.util.Scanner;

import com.signify.bean.Admin;
import com.signify.bean.Course;
import com.signify.bean.Professor;
import com.signify.bean.Student;
import com.signify.client.CRSApplicationMenu;
import com.signify.collection.DatabaseCollection;
import com.signify.dao.AdminDAO;
import com.signify.dao.UserDAOImplementation;
import com.signify.dao.professorDAO;

public class AdminService implements AdminInterface {
	
	AdminDAO unew= new AdminDAO();
	
	Scanner in = new Scanner(System.in);

	public void adminMenu() {
		System.out.println("--------WELCOME TO ADMIN-------- ");
		System.out.println("\t1.APPROVE STUDENT\n" + "\t2.ADD COURSE IN CATALOG\n" + "\t3.REMOVE COURSE FROM CATALOG\n"
				+ "\t4.ADD PROFESSOR\n" + "\t5.ADD ADMIN\n" + "\t6.GENERATE REPORT CARD\n"
				+ "\t7.ASSIGN PROFESSOR TO COURSE\n" + "\t8.VERIFY CREDENTIALS\n" + "\t9.UPDATE DETAILS\n"
				+ "\t10.VIEW COURSE FROM CATALOG\n" + "\t11.CALCULATE CPI\n" + "\t12.EXIT\n");
		
	}

	public void defaultAdmins() {
		Admin admin = new Admin();

		admin.setUsername("sre");
		//admin.setId(1);
		admin.setPassword("1234");
		admin.setDOJ("23-1-2023");

		DatabaseCollection.admins.add(admin);
	}

	public void addProfessor(int professorId) {
		Professor prof = new Professor();

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the professor ID: ");
		int ProfID = in.nextInt();
		System.out.println("Enter the professor name: ");
		String ProfUsername = in.next();
		System.out.println("Enter the professor password: ");
		String ProfPassword = in.next();
		System.out.println("Enter the professor department: ");
		String profdep = in.next();
		System.out.println("Enter the designation: ");
		String Profdesignation = in.next();
		System.out.println("Enter the DOJ (dd-mm-yy): ");
		String profDOJ = in.next();
		System.out.println("Enter the course: ");
		String pcourse = in.next();
		
		
		
		
		unew.add_prof(ProfID,ProfPassword,ProfUsername,profdep, Profdesignation, profDOJ,pcourse );
		
//		prof.setProfId(ProfID);
//		prof.setUsername(ProfUsername);
//		prof.setPassword(ProfPassword);
//		prof.setDOJ(profDOJ);
//		prof.setDesignation(Profdesignation);
//		prof.setDepartment(profdep);
//
//		if (DatabaseCollection.professors.add(prof)) {
//			System.out.println("professors is added");
//			
//			for (Professor professor : DatabaseCollection.professors) {
//				System.out.println( professor.getProfId() + " " + professor.getUsername() + " " + professor.getDepartment() + professor.getDesignation());
//			}
//			
//		}
//		else
//			System.out.println("professors account creation failed..");

	}

	public void addAdmin() {

		Admin admin = new Admin();

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the admin id: ");
		int adminid = in.nextInt();
		System.out.println("Enter the admin username: ");
		String adminUsername = in.next();
		System.out.println("Enter the admin password: ");
		String adminPassword = in.next();
		System.out.println("Enter the DOJ (dd-mm-yy): ");
		String adminDOJ = in.next();
		
		AdminDAO unew2 =new AdminDAO();
	    unew2.add_Admin(adminid , adminUsername, adminPassword, adminDOJ);
		
//		admin.setId(adminid);
//		admin.setUsername(adminUsername);
//		admin.setPassword(adminPassword);
//		admin.setDOJ(adminDOJ);
//
//		if (DatabaseCollection.admins.add(admin))
//			System.out.println("admin is added");
//		else
//			System.out.println("admin account creation failed..");
	}

	public void approveStudent(int Id) {
		
		Admin admin = new Admin();
		
		
		AdminDAO unew4 =new AdminDAO();
	    unew4.view_approve_student();
	    
	    Scanner in = new Scanner(System.in);
		System.out.println("Enter the ID of the student you want to approve: ");
		int stid = in.nextInt();
		
		AdminDAO unew5 =new AdminDAO();
	    unew5.approve_student(stid);
//		for(Student st:DatabaseCollection.students) {
//			if(st.getId()==stid) {
//				st.setIsapproved(1);
//			}
//		}
		
		System.out.println("student is approved");
	}

	public void generateReportCard(int studentId) {
		System.out.println("Report card is generated");
	}

	public void addCoursetocatalogue() {
		//System.out.println("Enter the course to add: ");
		Course course = new Course();
		
		Scanner in = new Scanner(System.in);
		
	    
	    System.out.println("Enter course code: ");
	    String ccode=in.next();
	    System.out.println("Enter course name:");
	    String cname=in.next();
	    System.out.println("Wheather course is offered or not:");
	    String isoffer=in.next();
	    System.out.println("Enter the Instructor:");
	    String instructor1=in.next();
	    System.out.println("Enter the course price :$");
	    float cprice1=in.nextFloat();
	    AdminDAO unew1 =new AdminDAO();
	    unew1.add_course_to_catalog(ccode , cname, instructor1, isoffer ,cprice1);
	    
	    
//	   course.setCourseCode(ccode);
//	   course.setInstructor(instructor1);
//	   course.setIsOffered(null);
//	   course.setName(cname);
//	   
//	   
//	   DatabaseCollection.courses.add(course);
//		System.out.println("Course is added");
	}

	public void deleteCoursetocatalogue() {
		//System.out.println("Enter the course to add: ");
		Course course = new Course();
		
		Scanner in = new Scanner(System.in);
		
	    
	    System.out.println("Enter course code: ");
	    String ccode=in.next();
//	    System.out.println("Enter course name:");
//	    String cname=in.next();
//	    System.out.println("Wheather course is offered or not:");
//	    String isoffer=in.next();
//	    System.out.println("Enter the Instructor:");
//	    String instructor1=in.next();
	    AdminDAO unew3 =new AdminDAO();
	    unew3.delete_Course_from_catalogue(ccode);
		System.out.println("Course is deleted");
	}

	public void verifycredentials() {
		System.out.println("Credentials verified");
	}

	public void assignprofessortoCourse(int courseId) {
		System.out.println("Course is assigned to professor");
	}

	public void calcpi(int studentId) {
		System.out.println("CPI is calculated");
	}

	public void viewcourse() {
		
		Course course = new Course();
		
		//Scanner in = new Scanner(System.in);
		
	    
	    System.out.println("++++++++++LIST OF COURSES FROM CATALOG+++++++++++++++ ");
	    
	    AdminDAO unew6 =new AdminDAO();
	    unew6.view_course();
		//System.out.println("Course is deleted");
	    //String ccode=in.next();
//		for (Course course : DatabaseCollection.courses) {
//			System.out.println(course.getCourseCode() + " " + course.getName() + " " + course.getIsOffered() + " " + course.getInstructor());
//		}
//		System.out.println("Course is viewed from catalog");
	}
	
	public void exit() {
		//CRSApplicationMenu.Menu();
	}

}
