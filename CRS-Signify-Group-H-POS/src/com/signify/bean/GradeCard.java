/**
 * 
 */
package com.signify.bean;

/**
 * @author tjkey
 *
 */
public class GradeCard {
	private int sudentId;
	private int semester;
	private float cpi;
	/**
	 * @return the sudentId
	 */
	public int getSudentId() {
		return sudentId;
	}
	/**
	 * @param sudentId the sudentId to set
	 */
	public void setSudentId(int sudentId) {
		this.sudentId = sudentId;
	}
	/**
	 * @return the semester
	 */
	public int getSemester() {
		return semester;
	}
	/**
	 * @param semester the semester to set
	 */
	public void setSemester(int semester) {
		this.semester = semester;
	}
	/**
	 * @return the cpi
	 */
	public float getCpi() {
		return cpi;
	}
	/**
	 * @param cpi the cpi to set
	 */
	public void setCpi(float cpi) {
		this.cpi = cpi;
	}
	/**
	 * @return the courselist
	 */
	public String getCourselist() {
		return Courselist;
	}
	/**
	 * @param courselist the courselist to set
	 */
	public void setCourselist(String courselist) {
		Courselist = courselist;
	}
	private String Courselist;
	

}
