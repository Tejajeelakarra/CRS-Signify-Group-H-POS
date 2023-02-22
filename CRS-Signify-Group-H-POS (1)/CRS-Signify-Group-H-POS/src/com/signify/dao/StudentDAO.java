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
public class StudentDAO {

	/**
	 * @param args
	 */
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/crsdatabase";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "123456";


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
					      String sql="insert into student (studentid,studentname, studentage, department, semester, stpassword,isapproved,fathersname)values(?,?,?,?,?,?,?,?)";
					      //String sql = "UPDATE Employees set age=? WHERE id=?";
					     // String sql1="delete from employee where id=?";
					     // stmt.setInt(1, 101);
					      stmt = conn.prepareStatement(sql);
					   
					 
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
}



