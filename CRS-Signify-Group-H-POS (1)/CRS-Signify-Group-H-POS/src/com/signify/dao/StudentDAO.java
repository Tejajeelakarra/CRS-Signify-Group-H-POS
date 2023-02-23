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

import com.signify.client.CRSStudentMenu;
import com.signify.constants.SQLConstants;
import com.signify.service.AdminService;
import com.signify.service.StudentService;
public class StudentDAO{

	/**
	 * @param args
	 */
	   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/crsdatabase";
       
	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "123456";
	   
	   
	   
	   public void studentLogin(String username, String password) {
		   Connection conn = null;
		   PreparedStatement stmt = null;
		   
		   try {
			  
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   
			   conn = DriverManager.getConnection(DB_URL,USER,PASS);
			   
			   String sql = SQLConstants.getUsers;
			   
			   stmt = conn.prepareStatement(sql);
			   
			  
			   
				ResultSet rs = stmt.executeQuery();

				//System.out.println("working... : " + rs + rs.getString("studentname"));
				
				
				 
				while (rs.next()) {
					String susername = rs.getString("username");
					String spassword = rs.getString("password");
					
					System.out.println("name: " + susername + " " + spassword);
					
					if (susername.equals(username)) {
						if (spassword.equals(password)) {
							CRSStudentMenu student = new CRSStudentMenu();
							student.StudentMenu();
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
	   }


	  //-------------------------------------------------------------------------------------------------------//
		// TODO Auto-generated method stub
		public boolean create_student(int studentid,String studentname,int studentage ,String deptartment,int semester,String stpassword, int isapproved, String fathername)
		{{
			// Step 2 
				// Declare the Connection or prepaid statement variable here 
				   Connection conn = null;
				   PreparedStatement stmt = null;
				   
				   try{
					   
					   // Step 3 Regiater Driver here and create connection 
					   
					   Class.forName("com.mysql.cj.jdbc.Driver");

					   // Step 4 make/open  a connection 
					   
					      System.out.println("Connecting to database...");
					      conn = DriverManager.getConnection(DB_URL,USER,PASS);
					   
					      //STEP 4: Execute a query
					      System.out.println("Creating statement...");
					      String sql="";
					      //String sql = "UPDATE Employees set age=? WHERE id=?";
					     // String sql1="delete from employee where id=?";
					     // stmt.setInt(1, 101);
					      stmt = conn.prepareStatement(SQLConstants.create_student);
					   
					 
					      //Bind values into the parameters.
					      stmt.setInt(1, studentid);  // This would set age
					      stmt.setString(2,studentname);
					      stmt.setInt(3, studentage);
					      stmt.setString(4, deptartment);
					      stmt.setInt(5, semester);
					      stmt.setString(6, stpassword);
					      stmt.setInt(7,0);
					      stmt.setString(8, fathername);
					      stmt.executeUpdate();
					           
					   
					   
					   // Let us update age of the record with ID = 102;
					      //int rows = stmt.executeUpdate();
					      //System.out.println("Rows impacted : " + rows );

					      // Let us select all the records and display them.
//					      sql = "SELECT studentid, studnetname ,studentage,department,semester,stpassword FROM student";
//					      ResultSet rs = stmt.executeQuery(sql);
//
//					      //STEP 5: Extract data from result set
//					      while(rs.next()){
//					         //Retrieve by column name
//					         int eid  = rs.getInt("studentid");
//					         String name1 = rs.getString("studentname");
//					         int age1 = rs.getInt("studentage");
//					         String dept1 = rs.getString("department");
//					         int sem1 = rs.getInt("semester");
//					         String stpass = rs.getString("stpassword");
//
//					         //Display values
//					         System.out.print("ID: " + id);
//					         System.out.print(", Name: " + name);
//					         System.out.print(", age: " + age);
//					         System.out.println(", department: " + dept);
//					         System.out.println(", semester: " + semester);
//					         System.out.println(", department: " + dept);
//
//					         
					      //}
					      //STEP 6: Clean-up environment
					     // rs.close();
					      stmt.close();
					      conn.close();
					   }catch(SQLException se){
					      //Handle errors for JDBC
					      se.printStackTrace();
					   }catch(Exception e){
					      //Handle errors for Class.forName
					      e.printStackTrace();
					   }finally{
					      //finally block used to close resources
					      try{
					         if(stmt!=null)
					            stmt.close();
					      }catch(SQLException se2){
					      }// nothing we can do
					      try{
					         if(conn!=null)
					            conn.close();
					      }catch(SQLException se){
					         se.printStackTrace();
					      }//end finally try
					   }//end try
					   System.out.println("Goodbye!");
					//end main

		   	return true;
			   //return false;
		   
		   }	
	
	}

	
		public void studentMenu() {
			// TODO Auto-generated method stub
			
		}


		public void register() {
			// TODO Auto-generated method stub
			
		}

	
		public void viewGradeCard(int studentId) {
			// TODO Auto-generated method stub
			
		}

		
		public void addCourse(String courseCode) {
			// TODO Auto-generated method stub
			
		}

		
//		public void dropCourse(String courseCode) {
			
			public boolean drop_course(String ccoded)
			{
				// Step 2 
					// Declare the Connection or prepaid statement variable here 
					   Connection conn = null;
					   PreparedStatement stmt = null;
					   
					   try{
						   
						   // Step 3 Regiater Driver here and create connection 
						   
						   Class.forName("com.mysql.cj.jdbc.Driver");

						   // Step 4 make/open  a connection 
						   
						      System.out.println("Connecting to database...");
						      conn = DriverManager.getConnection(DB_URL,USER,PASS);
						   
						      //STEP 4: Execute a query
						      System.out.println("Creating statement...");
						      String sql = "DELETE FROM registeredcourse WHERE coursecode='"+ccoded+"'";
						      //String sql = "UPDATE Employees set age=? WHERE id=?";
						     // String sql1="delete from employee where id=?";
						     // stmt.setInt(1, 101);
						      stmt = conn.prepareStatement(sql);
						   
						
//						         
						      //}
						      //STEP 6: Clean-up environment
						     // rs.close();
						      stmt.close();
						      conn.close();
						   }catch(SQLException se){
						      //Handle errors for JDBC
						      se.printStackTrace();
						   }catch(Exception e){
						      //Handle errors for Class.forName
						      e.printStackTrace();
						   }finally{
						      //finally block used to close resources
						      try{
						         if(stmt!=null)
						            stmt.close();
						      }catch(SQLException se2){
						      }// nothing we can do
						      try{
						         if(conn!=null)
						            conn.close();
						      }catch(SQLException se){
						         se.printStackTrace();
						      }//end finally try
						   }//end try
						   System.out.println("Goodbye!");
						//end main

			   	return true;
			}
				   //return false;
			   
	
			// TODO Auto-generated method stub
			
		

		
		public void payfees(int studentId) {
			// TODO Auto-generated method stub
			
		}

		
		public boolean view_course_details()
			{
				// Step 2 
					// Declare the Connection or prepaid statement variable here 
					   Connection conn = null;
					   PreparedStatement stmt = null;
					   
					   try{
						   
						   // Step 3 Regiater Driver here and create connection 
						   
						   Class.forName("com.mysql.cj.jdbc.Driver");

						   // Step 4 make/open  a connection 
						   
						      System.out.println("Connecting to database...");
						      conn = DriverManager.getConnection(DB_URL,USER,PASS);
						   
						      //STEP 4: Execute a query
						      System.out.println("Creating statement...");
						      //String sql = " SELECT * FROM registeredcourse ";
						      //String sql = "UPDATE Employees set age=? WHERE id=?";
						     // String sql1="delete from employee where id=?";
						     // stmt.setInt(1, 101);
						     // stmt = conn.prepareStatement(sql);
						      
						      String sql = " SELECT * FROM crsdatabase.cpricecourse ";	
						      stmt = conn.prepareStatement(sql);
						      ResultSet rs = stmt.executeQuery(sql);

						      //STEP 5: Extract data from result set
						      while(rs.next()){
						         //Retrieve by column name
						         String coursecode  = rs.getString("coursecode");
						         String coursename = rs.getString("coursename");
						         String instructor = rs.getString("instructor");
						         String isoffered = rs.getString("isoffered");


						         //Display values
						         System.out.print("CourseCode: " + coursecode);
						         System.out.print(", CourseName: " + coursename);
						         System.out.print(", Instructor: " + instructor);
						         System.out.println(", IsOffered: " + isoffered);
						         

						         
						      }
						
//						         
						      //}
						      //STEP 6: Clean-up environment
						     // rs.close();
						      stmt.close();
						      conn.close();
						   }catch(SQLException se){
						      //Handle errors for JDBC
						      se.printStackTrace();
						   }catch(Exception e){
						      //Handle errors for Class.forName
						      e.printStackTrace();
						   }finally{
						      //finally block used to close resources
						      try{
						         if(stmt!=null)
						            stmt.close();
						      }catch(SQLException se2){
						      }// nothing we can do
						      try{
						         if(conn!=null)
						            conn.close();
						      }catch(SQLException se){
						         se.printStackTrace();
						      }//end finally try
						   }//end try
						   System.out.println("Goodbye!");
						//end main

			   	return true;
				   //return false;
			   
			   }
			// TODO Auto-generated method stub
			
		

		
		public void viewRegisteredCourses() {
			// TODO Auto-generated method stub
			
		}

		
		public void exit() {
			// TODO Auto-generated method stub
			
		}
}



