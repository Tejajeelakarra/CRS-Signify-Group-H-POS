/**
 * 
 */
package com.signify.service;

import java.util.Scanner;

import com.signify.bean.Professor;
import com.signify.client.CRSApplicationMenu;
import com.signify.collection.DatabaseCollection;

public class ProfessorService implements ProfessorInterface {

	/*
	public void defaultLogin() {
		Professor professor = new Professor();

		professor.setProfId(901);
		professor.setUsername("Teja");
		professor.setPassword("123");
		professor.setDOJ("10-10-2022");
		professor.setDesignation("HOD");
		professor.setDepartment("IT");
		DatabaseCollection.professors.add(professor);
	}
	*/

	public int professorMenu() {
		
		System.out.println("--------WELCOME TO PROFESSOR-------- ");
		System.out.println("\t1.VIEW ENROLLED STUDENTS\n" + "\t2.ADD GRADE\n" + "\t3.EXIT\n");
		Scanner in = new Scanner(System.in);
		int option = in.nextInt();
		
		return option;

	}
	
	public void viewEnrolledStudents() {
		System.out.println("Enrolled students name");
	}

	public void addGrade() {
		System.out.println("Add grade");
	}
	public void exit() {
		//CRSApplicationMenu.Menu();
	}

}
