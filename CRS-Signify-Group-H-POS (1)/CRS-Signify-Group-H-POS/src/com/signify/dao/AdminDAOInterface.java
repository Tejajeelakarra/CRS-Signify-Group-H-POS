package com.signify.dao;

public interface AdminDAOInterface {
	public void adminMenu();
	public void defaultAdmins();
	public void addProfessor(int professorId);
	public void addAdmin();
	public void approveStudent(int studentId);
	public void generateReportCard(int studentId);
	public void addCoursetocatalogue();
	public void deleteCoursetocatalogue();
	public void verifycredentials();
	public void assignprofessortoCourse(int courseId);
	public void calcpi(int studentId);
	public void viewcourse();
	public void exit();

}