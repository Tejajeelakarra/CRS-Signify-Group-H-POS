/**
 * 
 */
package com.signify.service;

/**
 * @author sreva
 *
 */
public class AdminService {
	public void addProfessor(int professorId) {
		System.out.println("professor is added");
	}
	public void assignCourse(int courseId) {
		System.out.println("Course is assigned");
	}
	public void approveStudent(int studentId) {
		System.out.println("student is approved");
	}
	public void GenerateReportCard(int studentId) {
		System.out.println("Report card is generated");
	}
	public void addCoursetocatalogue() {
		System.out.println("Course is added");
	}
	public void deleteCoursetocatalogue() {
		System.out.println("Course is deleted");
	}
	public void verifycredentials() {
		System.out.println("Credentials verified");
	}
	public void assignprofessortoCourse(int courseId) {
		System.out.println("Course is assigned to professor");
	}
}
