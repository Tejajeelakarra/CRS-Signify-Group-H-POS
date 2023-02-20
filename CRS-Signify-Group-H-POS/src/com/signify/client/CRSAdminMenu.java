/**
 * 
 */
package com.signify.client;

import java.util.Scanner;

import com.signify.service.AdminInterface;
import com.signify.service.AdminService;
import com.signify.service.UserService;

/**
 * @author palak
 *
 */
public class CRSAdminMenu {
	
	public static void adminMenu() {
		
		AdminService adminService = new AdminService();
		
		Scanner in = new Scanner(System.in);

		adminService.adminMenu();
		
		System.out.println("Select your option: ");
		int option = in.nextInt();
		int studentId = 1;
		int adminId = 1;
	
		
		switch(option) {
		
		case 1:
			adminService.approveStudent(studentId);
			break;
		case 2:
			adminService.addCoursetocatalogue();
			break;
		case 3:
			adminService.deleteCoursetocatalogue();
			break;
		case 4:
			adminService.addProfessor(studentId);
			break;
		case 5:
			adminService.addAdmin();
			break;
		case 6:
			adminService.generateReportCard(studentId);
			break;
		case 7:
			adminService.assignprofessortoCourse(studentId);
			break;
		case 8:
			adminService.verifycredentials();
			break;
		case 9:
			UserService userService = new UserService();
			userService.updateDetails(adminId);
			break;
		case 10:
			adminService.viewcourse();
			break;
		case 11:
			adminService.calcpi(studentId);
			break;
		case 12:
			adminService.exit();
			break;
		default:
			System.out.println("Select the correct option...");
		
		}
		
		
	
//		AdminInterface adservice1= new AdminService();
//		
//		adservice1.addProfessor(200);
//		adservice1.approveStudent(101);
//		adservice1.addAdmin();
//		adservice1.GenerateReportCard(200);
//		adservice1.addCoursetocatalogue();
//		adservice1.deleteCoursetocatalogue();
//		adservice1.verifycredentials();
//		adservice1.assignprofessortoCourse(200);
//		adservice1.calcpi(200);
//		adservice1.viewcourse();
	}

}
