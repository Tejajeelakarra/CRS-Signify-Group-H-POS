/**
 * 
 */
package com.signify.service;

/**
 * @author sreva
 *
 */
public interface AdminInterface {
	public void addProfessor(int professorId);
	public void addadmin();
	public void approveStudent(int studentId);
	public void GenerateReportCard(int studentId);
	public void addCoursetocatalogue();
	public void deleteCoursetocatalogue();
	public void verifycredentials();
	public void assignprofessortoCourse(int courseId);
	public void calcpi(int studentId);
	public void viewcourse();
}
