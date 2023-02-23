/**
 * 
 */
package com.signify.dao;

import java.sql.*;
/**
 * @author tjkey
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.signify.constants.SQLConstants;

public class AdminDAO {

	/**
	 * @param args
	 */
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/crsdatabase";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "123456";

	public boolean add_course_to_catalog(String ccode, String cname, String instructor1, String isoffered,
			float cprice) {
		// Step 2
		// Declare the Coneection or prepaidstatement variable here
		Connection conn = null;
		PreparedStatement stmt = null;

		try {

			// Step 3 Regiater Driver here and create connection

			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 4 make/open a connection

			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			
			stmt = conn.prepareStatement(SQLConstants.add_course_catalog);

//				      // Hard coded data 
//				      
//				      int id=629;
//				      String name="Teja";
//				      String pass ="1234";
//				      String role="admin";
			// Bind values into the parameters.
			stmt.setString(1, ccode); // This would set age
			stmt.setString(2, cname);
			stmt.setString(3, instructor1);
			stmt.setString(4, isoffered);
			stmt.setFloat(5, cprice);

			stmt.executeUpdate();

			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
		// end main

		return true;
	}

	public boolean add_Admin(int adminid, String adminUsername, String adminPassword, String adminDOJ) {
		// Step 2
		// Declare the Coneection or prepaidstatement variable here
		Connection conn = null;
		PreparedStatement stmt = null;

		try {

			// Step 3 Regiater Driver here and create connection

			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 4 make/open a connection

			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query

			stmt = conn.prepareStatement(SQLConstants.add_admin);

			stmt.setInt(1, adminid); // This would set age
			stmt.setString(2, adminUsername);
			stmt.setString(3, adminPassword);
			stmt.setString(4, adminDOJ);

			stmt.executeUpdate();

			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
		// end mai
		return true;
	}

	public boolean delete_Course_from_catalogue(String ccode) {
		// Step 2
		// Declare the Coneection or prepaidstatement variable here
		Connection conn = null;
		PreparedStatement stmt = null;

		try {

			// Step 3 Regiater Driver here and create connection

			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 4 make/open a connection

			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
//				      System.out.println("Creating statement...");
//				      String sql = "DELETE FROM course WHERE coursecode='"+ccode+"'";
//				      String sql="ALTER TABLE course"
//				      		+ "DROP ROW FROM course where coursecode = '"+ccode+"'";

			stmt = conn.prepareStatement(SQLConstants.delete_Course_catalogue);

//				      stmt.setInt(1, adminid);  // This would set age
//				      stmt.setString(2,adminUsername);
//				      stmt.setString(3,adminPassword);
//				      stmt.setString(4, adminDOJ);
//				      
			stmt.executeUpdate();

			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
		// end main

		return true;
	}

	public boolean view_approve_student() {
		// Step 2
		// Declare the Coneection or prepaidstatement variable here
		Connection conn = null;
		PreparedStatement stmt = null;

		try {

			// Step 3 Regiater Driver here and create connection

			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 4 make/open a connection

			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
//				      System.out.println("Creating statement...");
//				      String sql="select studentname, studentid, department,semester from student WHERE isapproved =0";
//				      
			stmt = conn.prepareStatement(SQLConstants.view_approve_students);

			ResultSet rs = stmt.executeQuery();
			System.out.println("+++++++++++++++++++LIST OF UNAPPROVED STUDENTS++++++++++++++++++++ ");
			while (rs.next()) {
				String sname = rs.getString("studentname");
				int sid1 = rs.getInt("studentid");
				String dep1 = rs.getString("department");
				int sem1 = rs.getInt("semester");

				// Display values

				System.out.print("Name: " + sname);
				System.out.print("   ID: " + sid1);
				System.out.print("   Dept : " + dep1);
				System.out.println("  Semester : " + sem1);
			}

			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
			// System.out.println("Goodbye!");
		// end main

		return true;
	}

	@SuppressWarnings("resource")
	public boolean approve_student(int stid) {

		// Step 2
		// Declare the Coneection or prepaidstatement variable here
		Connection conn = null;
		PreparedStatement stmt = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			stmt = conn.prepareStatement(SQLConstants.approve_student + stid);
			stmt.executeUpdate();

			stmt = conn.prepareStatement(
					"select studentname, stpassword, studentid, department,semester from student WHERE isapproved =0 AND studentid="
							+ stid);

			ResultSet rs = stmt.executeQuery();
			System.out.println("+++++++++++++++++++LIST OF UNAPPROVED STUDENTS++++++++++++++++++++ ");

			String sname = "";
			String spass = "";
			int sid = 0;

			while (rs.next()) {
				sname = rs.getString("studentname");
				spass = rs.getString("stpassword");
				sid = rs.getInt("studentid");

				// Display values

				System.out.print("Name: " + sname);
				System.out.print("   ID: " + sid);

			}

			System.out.println(sid + " " + sname + " " + spass);

			String sql = "INSERT INTO crsdatabase.user(userid, username, password, roleid) VALUES (?,?,?,?);";

			stmt = conn.prepareStatement(sql);

			stmt.setInt(1, sid);
			stmt.setString(2, sname);
			stmt.setString(3, spass);
			stmt.setInt(4, 2);

			stmt.executeUpdate();

			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
		// end main

		return true;

	}

	public boolean add_prof(int ProfID, String ProfPassword, String ProfUsername, String profdep,
			String Profdesignation, String profDOJ, String pcourse) {
		// Step 2
		// Declare the Coneection or prepaidstatement variable here
		Connection conn = null;
		PreparedStatement stmt = null;

		try {

			// Step 3 Regiater Driver here and create connection

			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 4 make/open a connection

			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query

			stmt = conn.prepareStatement(SQLConstants.add_prof);

			stmt.setInt(1, ProfID); // This would set age
			stmt.setString(2, ProfPassword);
			stmt.setString(3, ProfUsername);
			stmt.setString(4, profdep);
			stmt.setString(5, Profdesignation);
			stmt.setString(6, profDOJ);
			stmt.setString(7, pcourse);
			
		   //String sql= "insert into user(uesrid, username, password, roleid) values (?,?,?,?)";
		   String sql = "INSERT INTO crsdatabase.user(userid, username, password, roleid) VALUES (?,?,?,?)";
		   stmt.setInt(1, ProfID);  // This would set age
		   stmt.setString(2,ProfUsername);
		   stmt.setString(3, ProfPassword);
		   stmt.setInt(4,3);
			

			stmt.executeUpdate();

			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
		// end mai
		return true;
	}

	public boolean view_course() {
		// Step 2
		// Declare the Coneection or prepaidstatement variable here
		Connection conn = null;
		PreparedStatement stmt = null;

		try {

			// Step 3 Regiater Driver here and create connection

			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 4 make/open a connection

			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
//				      System.out.println("Creating statement...");
//				      String sql="select studentname, studentid, department,semester from student WHERE isapproved =0";
//				      
			stmt = conn.prepareStatement(SQLConstants.view_course);

			ResultSet rs1 = stmt.executeQuery();
			// System.out.println("+++++++++++++++++++LIST OF UNAPPROVED
			// STUDENTS++++++++++++++++++++ ");
			while (rs1.next()) {
				String ccode = rs1.getString("coursecode");
				String cname = rs1.getString("coursename");
				String instructor1 = rs1.getString("instructor");
				String cp1 = rs1.getString("cprice");

				// Display values

				System.out.print("Course code: " + ccode);
				System.out.print("Course Name: " + cname);
				System.out.print(" Instructor: " + instructor1);
				System.out.println(" course Price : " + cp1);
			}

			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
			// System.out.println("Goodbye!");
		// end main

		return true;
	}

}
