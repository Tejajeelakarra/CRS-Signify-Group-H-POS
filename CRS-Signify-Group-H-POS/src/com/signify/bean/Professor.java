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
	private int DOJ;
	private String department;
	private String designation;
	
	//all professor setter getters
	public int getDOJ() {
		return DOJ;
	}
	public void setDOJ(int dOJ) {
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
