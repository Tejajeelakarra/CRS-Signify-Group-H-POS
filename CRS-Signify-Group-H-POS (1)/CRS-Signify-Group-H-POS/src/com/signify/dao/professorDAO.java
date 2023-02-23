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

import com.signify.client.CRSProfessorMenu;
import com.signify.client.CRSStudentMenu;
import com.signify.constants.SQLConstants;
public class professorDAO {

	/**
	 * @param args
	 */
	   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/crsdatabase"; //Change this

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "123456";	//Change this
	   
	
	   public boolean professorLogin(String username, String password) {
		   Connection conn = null;
		   PreparedStatement stmt = null;
		   
		   try {
			  
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   
			   conn = DriverManager.getConnection(DB_URL,USER,PASS);
			   
			   String sql = SQLConstants.getUsers1;
			   
			   
			   stmt = conn.prepareStatement(sql);
			   
			  
			   ResultSet rs = stmt.executeQuery();

				//System.out.println("working... : " + rs + rs.getString("studentname"));
				
				
				 
				while (rs.next()) {
					String susername = rs.getString("username");
					String spassword = rs.getString("password");
					
					System.out.println("name: " + susername + " " + spassword);
					
					if (susername.equals(username)) {
						if (spassword.equals(password)) {
							CRSProfessorMenu professor = new CRSProfessorMenu();
							professor.professorMenu();
							/*StudentService student = new StudentService();
							student.studentMenu();*/
							
							break;
						}
					}
				}
				
				
		   }
		   catch(SQLException se) {
			   se.printStackTrace();
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
	   
		return true;	}	
	   
	   public boolean add_grade(String grade, String studentname,String professorname, String coursename) {
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

				
				stmt = conn.prepareStatement(SQLConstants.add_grade);

//					      // Hard coded data 
//					      
//					      int id=629;
//					      String name="Teja";
//					      String pass ="1234";
//					      String role="admin";
				// Bind values into the parameters.
				stmt.setString(1, grade); // This would set age
				stmt.setString(2, studentname);
				stmt.setString(3, professorname);
				stmt.setString(4, coursename);
				//stmt.setFloat(5, cprice);

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

}
