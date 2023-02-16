/**
 * 
 */
package com.signify.bean;

/**
 * @author palak
 *
 */
public class User {
	
	//here all user properties
	private int userId;
	private String username;
	private String role;

	
	//all user setter getters
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return username;
	}
	public void setName(String name) {
		this.username = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
