/**
 * 
 */
package com.signify.client;

import java.util.Scanner;

import com.signify.service.StudentService;
import com.signify.service.UserService;

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
		
		boolean t = true;
		while (t) {

			Scanner in = new Scanner(System.in);

			int i = Menu();
			switch (i) {

			case 1: 
				user.login();

				System.out.print("choose user role: \n");
				System.out.println("\t1.ADMIN\n" + "\t2.STUDENT\n" + "\t3.PROFESSOR\n");

				System.out.print("choose user role: \n");
				int role = in.nextInt();

				System.out.println("role: " + role);

				switch (role) {
				case 1:
					System.out.println("--------WELCOME TO ADMIN-------- ");
					System.out.println("\t1.APPROVE STUDENT\n" + "\t2.ADD COURSE IN CATALOG\n"
							+ "\t3.REMOVE COURSE FROM CATALOG\n" + "\t4.ADD PROFESSOR\n" + "\t5.ADD ADMIN\n"
							+ "\t6.GENERATE REPORT CARD\n" + "\t7.ASSIGN PROFESSOR TO COURSE\n"
							+ "\t8.VERIFY CREDENTIALS\n" + "\t9.UPDATE DETAILS\n" + "\t10.VIEW COURSE FROM CATALOG\n"
							+ "\t11.CALCULATE CPI\n" + "\t12.EXIT\n");
					System.out.print("Enter your option no.: ");
					int i2 = in.nextInt();
					if (i2 == 12) {
						// Menu();
					}

					break;
					
				case 2:
					System.out.println("--------WELCOME TO STUDENT-------- ");
					System.out.println("\t1.VIEW GRADE CARD\n" + "\t2.ADD COURSE\n" + "\t3.DROP COURSE\n"
							+ "\t4.PAY FEES\n" + "\t5.VIEW COURSE DETAILS\n" + "\t6.VIEW REGISTERED COURSE\n"
							+ "\t7.UPDATE DETAILS\n" + "\t8.EXIT\n");
					System.out.print("Enter your option no.: ");
					int i3 = in.nextInt();
					if (i3 == 8) {
						// Menu();
					}
					break;
				case 3:
					System.out.println("--------WELCOME TO PROFESSOR-------- ");
					System.out.println("\t1.VIEW ENROLLED STUDENTS\n" + "\t2.ADD GRADE\n" + "\t3.EXIT");
					System.out.print("Enter your option no.: ");
					int i4 = in.nextInt();
					if (i4 == 3) {
						// Menu();
					}

					break;
				}
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