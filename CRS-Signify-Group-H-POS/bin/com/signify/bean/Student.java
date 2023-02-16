 /**
 * 
 */
package com.signify.bean;

/**
 * @author WELCOME
 *
 */
public class Student {
	
    public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	private int studentId;
	private String branch;
    private String batch;
}
