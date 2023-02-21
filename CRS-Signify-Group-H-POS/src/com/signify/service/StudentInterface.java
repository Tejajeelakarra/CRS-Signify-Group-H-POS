package com.signify.service;

public interface StudentInterface {
	//public void changePassword(int studentId);
	public void studentMenu();
	public  void register();
	public void viewGradeCard(int studentId);
	public void addCourse(String courseCode);
	public void dropCourse(String courseCode);
	public void payfees(int studentId);
	public void viewCourseDetails();
	public void viewRegisteredCourses();
	public void exit();
}
