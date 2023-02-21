/**
 * 
 */
package com.signify.client;

import com.signify.service.ProfessorService;

import java.util.Scanner;

import com.signify.service.ProfessorInterface;

public class CRSProfessorMenu {
	
	public static void professorMenu() {
			ProfessorService professorService = new ProfessorService();
			
			professorService.professorMenu();
			System.out.println("Select your option: ");
			
			Scanner in = new Scanner(System.in);
			
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
