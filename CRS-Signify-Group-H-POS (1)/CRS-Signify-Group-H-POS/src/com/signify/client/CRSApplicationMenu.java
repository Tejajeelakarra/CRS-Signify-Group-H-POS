/**
 * 
 */
package com.signify.client;

import java.util.Scanner;

import com.signify.service.AdminService;
import com.signify.service.StudentService;
import com.signify.service.UserService;
import com.signify.service.ProfessorService;

public class CRSApplicationMenu {

	public static int Menu() {
		System.out.println("--------WELCOME TO CRS APPLICATION-------- ");
		System.out.println("MAIN MENU ");
		System.out.println("\t1.LOGIN\n" + "\t2.REGESTRATION FOR STUDENT\n" + "\t3.UPDTAE PASSWORD\n" + "\t4.EXIT\n");
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your option no.: ");
		int i = in.nextInt();
		return i;
	}

	public static void main(String[] args) {

		StudentService student = new StudentService();
		UserService user = new UserService();
		AdminService admin = new AdminService();
		admin.defaultAdmins();
		ProfessorService professor = new ProfessorService();
		
		boolean t = true;
		
		while (t) {

			Scanner in = new Scanner(System.in);

			int i = Menu();
			switch (i) {

			case 1:
				user.login();
				break;

			case 2:
				student.register();
				break;

			case 3:
				user.updatePassword();
				break;

			case 4:
				t = false;
				System.out.println("Logged Out");
				break;

			default:
				System.out.println("Invalid Option Select Again");

			}
		}

	}

}