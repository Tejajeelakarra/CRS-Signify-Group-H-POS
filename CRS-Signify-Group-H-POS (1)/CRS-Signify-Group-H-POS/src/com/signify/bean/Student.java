 /**
 * 
 */
package com.signify.bean;

/**
 * @author WELCOME
 *
 */
public class Student {
	private String name;
	private String password;
	private int Isapproved;
	public int getIsapproved() {
		return Isapproved;
	}
	public void setIsapproved(int isapproved) {
		Isapproved = isapproved;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private int id;
	private int semester;
	private int age;
	private String department;
	private String FatherName;
	
	
	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return FatherName;
	}
	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
		
}

