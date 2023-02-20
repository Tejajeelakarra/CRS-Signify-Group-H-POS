/**
 * 
 */
package com.signify.service;

/**
 * @author sreva
 *
 */
public class AdminService implements AdminInterface{
	public void addProfessor(int professorId) {
		
		System.out.println("professor is added");
	}
	public void addadmin() {
		System.out.println("admin is added");
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
	public void calcpi(int studentId) {
		System.out.println("CPI is calculated");
	}
	public void viewcourse() {
		System.out.println("Course is viewed from catalog");
	}
}
