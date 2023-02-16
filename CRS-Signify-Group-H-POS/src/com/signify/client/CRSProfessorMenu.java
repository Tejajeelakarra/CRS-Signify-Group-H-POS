/**
 * 
 */
package com.signify.client;

import com.signify.service.Professorservice;

/**
 * @author palak
 *
 */
public class CRSProfessorMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professorservice service = new Professorservice();
		service.viewEnrolledStudents();
		service.addGrade();
	}

}
