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

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "123456";
	   
	   public boolean add_course_to_catalog(String ccode,String cname,String instructor1,String isoffered, float cprice)
	   {
		// Step 2 
			// Declare the Coneection or prepaidstatement variable here 
			   Connection conn = null;
			   PreparedStatement stmt = null;
			   
			   try{
				   
				   // Step 3 Regiater Driver here and create connection 
				   
				   Class.forName("com.mysql.cj.jdbc.Driver");

				   // Step 4 make/open  a connection 
				   
				      System.out.println("Connecting to database...");
				      conn = DriverManager.getConnection(DB_URL,USER,PASS);
				   
				      //STEP 4: Execute a query
//				      System.out.println("Creating statement...");
//				      String sql="insert into course values(?,?,?,?,?)";
				      //String sql = "UPDATE Employees set age=? WHERE id=?";
				     // String sql1="delete from employee where id=?";
				     // stmt.setInt(1, 101);
				      stmt = conn.prepareStatement(SQLConstants.add_course_catalog);
				   
//				      // Hard coded data 
//				      
//				      int id=629;
//				      String name="Teja";
//				      String pass ="1234";
//				      String role="admin";
				      //Bind values into the parameters.
				      stmt.setString(1, ccode);  // This would set age
				      stmt.setString(2,cname);
				      stmt.setString(3, instructor1);
				      stmt.setString(4, isoffered);
				      stmt.setFloat(5, cprice);
				      
				      stmt.executeUpdate();
				           
				   
				   
				   
				   // Let us update age of the record with ID = 102;
				      //int rows = stmt.executeUpdate();
				     // System.out.println("Rows impacted : " + rows );

				      // Let us select all the records and display them.
//				      sql = "SELECT id, name ,address, location FROM employee";
//				      ResultSet rs = stmt.executeQuery(sql);
//
//				      //STEP 5: Extract data from result set
//				      while(rs.next()){
//				         //Retrieve by column name
//				         int eid  = rs.getInt("id");
//				         String name1 = rs.getString("name");
//				         String address1 = rs.getString("address");
//				         String location1 = rs.getString("location");
//
//				         //Display values
//				         System.out.print("ID: " + eid);
//				         System.out.print(", Age: " + name1);
//				         System.out.print(", First: " + address1);
//				         System.out.println(", Last: " + location1);
//				      }
//				      //STEP 6: Clean-up environment
//				     // rs.close();
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
	   
	   
	   public boolean add_Admin(int adminid,String adminUsername,String adminPassword,String adminDOJ)
	   {
		// Step 2 
			// Declare the Coneection or prepaidstatement variable here 
			   Connection conn = null;
			   PreparedStatement stmt = null;
			   
			   try{
				   
				   // Step 3 Regiater Driver here and create connection 
				   
				   Class.forName("com.mysql.jdbc.Driver");

				   // Step 4 make/open  a connection 
				   
				      System.out.println("Connecting to database...");
				      conn = DriverManager.getConnection(DB_URL,USER,PASS);
				   
				      //STEP 4: Execute a query
				      
				      
				      stmt = conn.prepareStatement(SQLConstants.add_admin);
				   

				      stmt.setInt(1, adminid);  // This would set age
				      stmt.setString(2,adminUsername);
				      stmt.setString(3,adminPassword);
				      stmt.setString(4, adminDOJ);
				      
				      stmt.executeUpdate();
				           

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
				//end mai
	   	return true;
}
	   
	   public boolean delete_Course_from_catalogue(String ccode)
	   {
		// Step 2 
			// Declare the Coneection or prepaidstatement variable here 
			   Connection conn = null;
			   PreparedStatement stmt = null;
			   
			   try{
				   
				   // Step 3 Regiater Driver here and create connection 
				   
				   Class.forName("com.mysql.cj.jdbc.Driver");

				   // Step 4 make/open  a connection 
				   
				      System.out.println("Connecting to database...");
				      conn = DriverManager.getConnection(DB_URL,USER,PASS);
				   
				      //STEP 4: Execute a query
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
	   
	   public boolean view_approve_student()
	   {
		// Step 2 
			// Declare the Coneection or prepaidstatement variable here 
			   Connection conn = null;
			   PreparedStatement stmt = null;
			   
			   try{
				   
				   // Step 3 Regiater Driver here and create connection 
				   
				   Class.forName("com.mysql.cj.jdbc.Driver");

				   // Step 4 make/open  a connection 
				   
				      System.out.println("Connecting to database...");
				      conn = DriverManager.getConnection(DB_URL,USER,PASS);
				   
				      //STEP 4: Execute a query
//				      System.out.println("Creating statement...");
//				      String sql="select studentname, studentid, department,semester from student WHERE isapproved =0";
//				      
				      stmt = conn.prepareStatement(SQLConstants.view_approve_students);
				      				      
				      ResultSet rs = stmt.executeQuery();
				      while(rs.next())
				      {
				    	  String  sname = rs.getString("studentname");
					      int sid1 = rs.getInt("studentid");
					      String dep1 = rs.getString("department");
					      int sem1 = rs.getInt("semester");
	
					         //Display values
					      	System.out.println("+++++++++++++++++++LIST OF UNAPPROVED STUDENTS++++++++++++++++++++ ");
					         System.out.print("Name: " + sname);
					         System.out.print("   ID: " + sid1);
					         System.out.print("   Dept : " + dep1);
					         System.out.println("  Semester : " + sem1); 
				      }
				           
				      
				      

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
				   //System.out.println("Goodbye!");
				//end main

	   	return true;
}
	   
	   public boolean approve_student(int stid )
	   {
		// Step 2 
			// Declare the Coneection or prepaidstatement variable here 
			   Connection conn = null;
			   PreparedStatement stmt = null;
			   
			   try{
				   
				   // Step 3 Regiater Driver here and create connection 
				   
				   Class.forName("com.mysql.cj.jdbc.Driver");

				   // Step 4 make/open  a connection 
				   
				      System.out.println("Connecting to database...");
				      conn = DriverManager.getConnection(DB_URL,USER,PASS);
				   
				      //STEP 4: Execute a query
				      //System.out.println("Creating statement...");
//				      String sql="UPDATE student SET isapproved=1 WHERE studentid='"+stid+"'";
				      
				      stmt = conn.prepareStatement(SQLConstants.approve_student);
				      				      
				      stmt.executeUpdate();
//				      while(rs.next())
//				      {
//				    	  String  sname = rs.getString("studentname");
//					      int sid1 = rs.getInt("studentid");
//					      String dep1 = rs.getString("department");
//					      int sem1 = rs.getInt("semester");
//	
//					         //Display values
//					         System.out.print("Name: " + sname);
//					         System.out.print("   ID: " + sid1);
//					         System.out.print("   Dept : " + dep1);
//					         System.out.println("  Semester : " + sem1); 
//				      }
				           
				      
				      

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

}	


