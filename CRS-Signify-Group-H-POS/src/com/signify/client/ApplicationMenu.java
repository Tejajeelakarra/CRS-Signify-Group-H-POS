/**
 * 
 */
package com.signify.client;

import com.signify.service.PaymentInterface;
import com.signify.service.PaymentService;
import com.signify.service.UserInterface;
import com.signify.service.UserService;
import java.util.Scanner;


public class ApplicationMenu {

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
	
		PaymentInterface service = new PaymentService();
		service.sendNotification();
		service.selectpayment();

		UserInterface service2 = new UserService();
		service2.updateDetails(100);
		//service2.updatePassword(100);

		CRSAdminMenu.main(args);
		CRSProfessorMenu.main(args);
		CRSStudentMenu.main(args);

		boolean t = true;
		while (t) {
			Scanner in = new Scanner(System.in);
			int i = Menu();
			switch (i) {

			case 1:
				System.out.println("--------LOGIN PAGE-------- ");
				
				System.out.print("Enter user name: ");
				String name = in.next();
				
				System.out.print("Enter your Password: ");
				String pass = in.next();
			
				System.out.println("Name: " + name);
				System.out.println("Password: " + pass);

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
				System.out.println("--------REGESTRATION FOR STUDENT-------- ");
				System.out.println("Enter Your Details");
				// Scanner in = new Scanner(System.in);
				System.out.print("Enter Student name: ");
				String name1 = in.next();
				// System.out.println("Student Name: " + name1);
				System.out.print("Enter Your Age: ");
				int i1 = in.nextInt();
				// System.out.println("Age: " + i1);
				System.out.print("Enter Your Department: ");
				String b = in.next();
				// System.out.println("Department: " + b);
				System.out.print("Enter Semester: ");
				int a = in.nextInt();
				// System.out.println("Semester: " + a);
//		    System.out.println("Verify your details: YES/NO");
				System.out.println("Student Name: " + name1);
				System.out.println("Age: " + i1);
				// System.out.println("Student Name: " + name1);
				System.out.println("Department: " + b);
				System.out.println("Semester: " + a);

//		    String verify = in.next();
//		    if(verify=="YES") {
//		    	System.out.println("Request sent");
//		    	System.out.println("Notification will be sent once approved");
//		    }else {
//		    	System.out.println("Enter details again");

//		    }
				System.out.println("Request sent");
				System.out.println("Notification will be sent once approved");
				// System.out.println("role: " + role);

				break;

			case 3:
				System.out.println("-------UPDATE PASSWORD------");
				System.out.print("Enter user name: ");
				String name2 = in.next();
				String password = "abcd@123";
				// System.out.println("-------UPDATE PASSWORD------");
				// Print the string
				System.out.print("Enter your old password: ");
				String oldPassword = in.next();

				System.out.print("Enter your new password: ");
				String newPassword = in.next();

				System.out.println("Enter confirm new password: ");
				String confpassword = in.next();

				if (password.equals(oldPassword) == false || newPassword.equals(confpassword) == false) {
					System.out.println("Password does not match");
					return;
				}

				System.out.println("Password updated Successfully!");
				System.out.println("=======================================");
				Menu();

				break;
			case 4:
				// Menu();
				System.out.println("LOG OUT");
				t = false;
				break;
			default:
				System.out.println("Invalid Option Select Again");

			}
		}
	}
}
