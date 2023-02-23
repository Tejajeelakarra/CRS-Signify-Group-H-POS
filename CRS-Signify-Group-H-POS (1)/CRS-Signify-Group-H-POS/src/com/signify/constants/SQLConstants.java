/**
 * 
 */
package com.signify.constants;
//import com.signify.dao.*;
/**
 * @author WELCOME
 *
 */
public class SQLConstants {
	
	// User SQL constants 
	
	public static final String RIGISTER_USER="insert into user values(?,?,?,?)";
	public static final String VIEW_USER="SELECT userid, username ,password,role FROM user";
	
	
	//Student SQL constants
	public static final String create_student="insert into student (studentid,studentname, studentage, department, semester, stpassword,isapproved,fathersname)values(?,?,?,?,?,?,?,?";
	
	// admin SQL constants 
	
	public static final String getUsers = "select * from user where roleid=2";
	
	public static final String add_course_catalog="insert into course values(?,?,?,?,?)";
	public static final String add_admin="insert into admin values(?,?,?,?)";
	public static final String add_prof="insert into professor values(?,?,?,?,?,?,?)";
	private static String ccode;
	private static String stid;
	public static final String delete_Course_catalogue = "DELETE FROM course WHERE coursecode='"+ccode+"'";
	public static final String view_approve_students="select studentname, studentid, department,semester from student WHERE isapproved =0";
	public static final String approve_student="UPDATE student SET isapproved=1 WHERE studentid=";
	public static final String view_course="select coursecode, coursename,instructor,cprice from course";
	
	//public static final String student_login="INSERT INTO user (userid, username, password )SELECT studentid, studentname,stpassword FROM student WHERE isapproved= 1";
	// professo r SQL Constants 
	
	

}
