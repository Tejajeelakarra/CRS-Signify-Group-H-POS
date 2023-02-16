/**
 * 
 */
package com.signify.bean;

/**
 * @author WELCOME
 *
 */
public class Course {
	private String courseCode;
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsOffered() {
		return isOffered;
	}
	public void setIsOffered(Boolean isOffered) {
		this.isOffered = isOffered;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	private String name;
    private Boolean isOffered;
    private String instructor;

}
