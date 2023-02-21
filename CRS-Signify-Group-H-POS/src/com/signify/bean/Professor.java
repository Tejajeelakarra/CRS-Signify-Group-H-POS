/**
 * 
 */
package com.signify.bean;

/**
 * @author palak
 *
 */
public class Professor {
	//here all professor properties
	private String DOJ;
	private String department;
	private String designation;

	
	//all professor setter getters
	public String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String password;
	public int ProfId;
	public int getProfId() {
		return ProfId;
	}
	public void setProfId(int profId) {
		ProfId = profId;
	}
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
