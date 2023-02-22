/**
 * 
 */
package com.signify.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.signify.constants.SQLConstants;
import com.signify.service.ProfessorService;
import com.signify.service.StudentService;

/**
 * @author TEJA
 *
 */
public class UserDAOImplementation {
	
	public static void main(String[] args) {
		UserDAOImplementation user = new UserDAOImplementation();
		
		user.studentLogin("aanchal", "aa12");
	}
	
	// Step 1
		// JDBC driver name and database URL
		   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
		   static final String DB_URL = "jdbc:mysql://localhost/crsdatabase";

		   //  Database credentials
		   static final String USER = "root";
		   static final String PASS = "123456";
		  // Connection conn = null;
		  // PreparedStatement stmt = null;
		   
		   public boolean create_user(int id,String name,String pass,String role)
		   {

			   
			// Step 2 
				// Declare the Connection or prepaidstatement variable here 
				   Connection conn = null;
				   PreparedStatement stmt = null;
				   
				   try{
					   
					   // Step 3 Regiater Driver here and create connection 
					   
					   Class.forName("com.mysql.jdbc.Driver");

					   // Step 4 make/open  a connection 
					   
					      System.out.println("Connecting to database...");
					      conn = DriverManager.getConnection(DB_URL,USER,PASS);
					   
					      //STEP 4: Execute a query
					      System.out.println("Creating statement...");
					     // String sql="insert into user values(?,?,?,?)";
					      //String sql = "UPDATE Employees set age=? WHERE id=?";
					     // String sql1="delete from employee where id=?";
					     // stmt.setInt(1, 101);
					      stmt = conn.prepareStatement(SQLConstants.RIGISTER_USER);
					   
					 
					      //Bind values into the parameters.
					      stmt.setInt(1,id);  // This would set age
					      stmt.setString(2,name);
					      stmt.setString(3,pass);
					      stmt.setString(4,role);
					      stmt.executeUpdate();
					           
					      

					  
					      //System.out.println("Rows impacted : " + rows );

					      // Let us select all the records and display them.
					      //sql = "SELECT userid, username ,password,role FROM user";
					      ResultSet rs = stmt.executeQuery(SQLConstants.VIEW_USER);

					      //STEP 5: Extract data from result set
					      while(rs.next()){
					         //Retrieve by column name
					         int eid  = rs.getInt("userid");
					         String name1 = rs.getString("username");
					         String pass1 = rs.getString("password");
					         String role1 = rs.getString("role");

					         //Display values
					         System.out.print("ID: " + eid);
					         System.out.print(", Name: " + name1);
					         System.out.print(", Pass: " + pass1);
					         System.out.println(", Role: " + role1);
					      }
					      //STEP 6: Clean-up environment
					     // rs.close();
					      stmt.close();
					      //stmt1.close();
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
					   System.out.println("Registration Completed");
					//end main	
			   
			   
			   return true;
			   //return false;
		   }
		   
//		   public boolean validate(int userID,String password,String Role)
//			{
//				
//		           boolean res = false;
//				   try{
//					   
//					   // Step 3 Register Driver here and create connection 
//					   
//					      int role = 0;
//					      if(Role.equals("admin"))
//					      {
//					    	  role = 1;
//					      }
//					      else if(Role.equals("student"))
//					      {
//			                  role = 2;  		    	  
//					      }
//					      else if(Role.equals("professor"))
//					      {
//					    	  role = 3;
//					      }
//					      System.out.println("Connecting to database...");
//					      conn = DriverManager.getConnection(DB_URL,USER,PASS);
//					   
//					 
//					      String sql="select * from src.user where id="+userID+" and password='"+password+"' and roleid="+role;
//					      stmt = conn.prepareStatement(sql);
//					      ResultSet rs = stmt.executeQuery(sql);
//		  
//					      //STEP 5: Extract data from result set
//					      if(rs.next()) {
//					    	  if(rs.getInt("id")==userID && rs.getString("password").equals(password) && rs.getInt("roleid")==role) {
//					    		  if(Role.equals("student")) {
//					    			  if(rs.getInt("isapproved")==0) {
//					    				  System.out.println("Pending Admin Approval....");
//					    				  return false;
//					    			  }
//					    		  }
//					    		  res = true;
//					    		  System.out.println("You have successfully logged in as "+Role+".....");
//					    	  }
//					
//					      }
//					      if(!res)
//					      {
//					    	  System.out.println("Invalid credentials");
//					      }
//					      //STEP 6: Clean-up environment
//					     
//					      stmt.close();
//					      conn.close();
//					   }catch(SQLException se){
//					      //Handle errors for JDBC
//						   System.out.println("SQLException"+ se.getErrorCode()+"-->"+se.getCause());
//					      se.printStackTrace();
//					   }catch(Exception e){
//					      //Handle errors for Class.forName
//						   System.out.println("Exception"+e.getLocalizedMessage());
//					      e.printStackTrace();
//					   }finally{
//					      //finally block used to close resources
//					      try{
//					         if(stmt!=null)
//					            stmt.close();
//					      }catch(SQLException se2){
//					      }// nothing we can do
//					      try{
//					         if(conn!=null)
//					            conn.close();
//					      }catch(SQLException se){
//					         se.printStackTrace();
//					      }//end finally try
//					   }//end try
//					   System.out.println();
//		      //end main
//					   return res;
//			}
		   
//		   
//		   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//			static final String DB_URL = "jdbc:mysql://localhost/test_schema";
//			static final String USER = "root";
//			static final String PASS = "123456";

			public boolean studentLogin(String username, String password) {
				
				
				 Connection conn = null;
				 PreparedStatement stmt = null;
				 
				   try {
					   
					   Class.forName("com.mysql.jdbc.Driver");
				      System.out.println("Connecting to database...");
				      conn = DriverManager.getConnection(DB_URL,USER,PASS);
				      
				      
				      String sql = "select * from user";
				      stmt = conn.prepareStatement(sql);
				      
				      ResultSet result = stmt.executeQuery();
				      
				      while (result.next()) {
				    	  String userName = result.getString("username");
				    	  String userPassword = result.getString("password");
				    	  int userRoleId = result.getInt("roleid");
				    	 
				    	  if (username.equals(userName) && password.equals(userPassword) && userRoleId == 2) {
				    		StudentService sc = new StudentService();
				    		sc.studentMenu();
				    	  }
				    	  
				    	 
				    	  
				      }
				      
				      
				   }
				   catch(Exception e) {
					   System.out.print(e);
				   }
				
				
				return false;
			}
}