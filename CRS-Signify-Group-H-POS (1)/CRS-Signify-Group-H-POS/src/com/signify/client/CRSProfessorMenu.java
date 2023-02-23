/**
 * 
 */
package com.signify.client;

import com.signify.service.ProfessorService;

import java.util.Scanner;

import com.signify.service.ProfessorInterface;

public class CRSProfessorMenu {
	static ProfessorService professorService = new ProfessorService();
	
		public static void professorMenu() {
			
			System.out.println("--------WELCOME TO PROFESSOR-------- ");
			System.out.println("\t1.VIEW ENROLLED STUDENTS\n" + "\t2.ADD GRADE\n" + "\t3.EXIT\n");
			System.out.println("Select your option: ");
			Scanner in = new Scanner(System.in);
			//int option = in.nextInt();
			
			//return option;

		
			
			//Scanner in = new Scanner(System.in);
			//UserService.professorMenu();
			//System.out.println("Select your option: ");
			
			
			
			int option = in.nextInt();
			
			switch(option) {
			
			case 1: 
				professorService.viewEnrolledStudents();
				break;
			case 2:
				professorService.addGrade();
				break;
			case 3:
				professorService.exit();
				//CRSApplicationMenu.Menu();
				break;
			default:
				System.out.println("Select correct option...");
			
			
			}
			
	}
	
}
