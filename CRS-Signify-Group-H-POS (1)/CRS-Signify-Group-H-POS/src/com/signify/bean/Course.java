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
	private String name;
    private String isOffered;
    private String instructor;
    private float cprice;
    
    
	public float getCprice() {
		return cprice;
	}
	public void setCprice(float cprice) {
		this.cprice = cprice;
	}
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
	public String getIsOffered() {
		return isOffered;
	}
	public void setIsOffered(String isOffered) {
		this.isOffered = isOffered;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	

}
