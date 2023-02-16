/**
 * 
 */
package com.signify.client;

import com.signify.service.AdminService;

/**
 * @author palak
 *
 */
public class CRSAdminMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminService adservice1= new AdminService();
		adservice1.addProfessor(200);
		adservice1.approveStudent(101);
		adservice1.assignCourse(701);
		adservice1.GenerateReportCard(200);
		adservice1.addCoursetocatalogue();
		adservice1.deleteCoursetocatalogue();
		adservice1.verifycredentials();
		adservice1.assignprofessortoCourse(200);
	}

}
