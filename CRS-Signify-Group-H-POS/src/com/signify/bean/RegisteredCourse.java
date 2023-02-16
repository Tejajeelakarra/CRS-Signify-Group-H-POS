/**
 * 
 */
package com.signify.bean;

/**
 * @author sreva
 *
 */
public class RegisteredCourse {
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public int getSemeser() {
		return semester;
	}
	public void setSemeser(int semester) {
		this.semester = semester;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	private String courseCode;
	private int semester;
	private int studentId;
	private String grade;
}
