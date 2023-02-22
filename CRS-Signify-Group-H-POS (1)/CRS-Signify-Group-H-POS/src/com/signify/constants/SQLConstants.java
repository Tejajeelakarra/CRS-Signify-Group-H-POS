/**
 * 
 */
package com.signify.constants;
import com.signify.dao.*;
/**
 * @author WELCOME
 *
 */
public class SQLConstants {
	
	// Stsudent SQL constants 
	
	public static final String RIGISTER_USER="insert into user values(?,?,?,?)";
	public static final String VIEW_USER="SELECT userid, username ,password,role FROM user";
	
	// admin SQL constants 
	
	
	public static final String add_course_catalog="insert into course values(?,?,?,?,?)";
	public static final String add_admin="insert into admin values(?,?,?,?)";
	private static String ccode;
	private static String stid;
	public static final String delete_Course_catalogue = "DELETE FROM course WHERE coursecode='"+ccode+"'";
	public static final String view_approve_students="select studentname, studentid, department,semester from student WHERE isapproved =0";
	public static final String approve_student="UPDATE student SET isapproved=1 WHERE studentid='"+stid+"'";
	
	// professor SQL Constants 

}
