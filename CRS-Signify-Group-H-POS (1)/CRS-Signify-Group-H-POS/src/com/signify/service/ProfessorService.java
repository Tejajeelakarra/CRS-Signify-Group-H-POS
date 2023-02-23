/**
 * 
 */
package com.signify.service;

import java.util.Scanner;

import com.signify.bean.Professor;
import com.signify.client.CRSApplicationMenu;
import com.signify.collection.DatabaseCollection;
import com.signify.dao.AdminDAO;
import com.signify.dao.professorDAO;

public class ProfessorService implements ProfessorInterface {

	professorDAO unew= new professorDAO();
	
	
	public void viewEnrolledStudents() {
		System.out.println("Enrolled students name");
	}

	public void addGrade() {
		Professor prof = new Professor();

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the grade: ");
		String grade = in.next();
		System.out.println("Enter the student name: ");
		String studentname = in.next();
		System.out.println("Enter the professor name: ");
		String professorname = in.next();
		System.out.println("Enter the course name: ");
		String coursename = in.next();

		
		
		
		
		//AdminDAO unew5= new AdminDAO();
		unew.add_grade(grade, studentname,professorname, coursename);
		System.out.println("grade added");
	}
	public void exit() {
	CRSApplicationMenu.Menu();
	}

}
