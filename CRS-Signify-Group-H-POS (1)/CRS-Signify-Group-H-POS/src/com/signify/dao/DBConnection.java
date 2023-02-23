/**
 * 
 */
package com.signify.dao;

/**
 * @author tjkey
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
		


public class DBConnection {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/crsdatabase";

	static final String USER = "root";
	static final String PASS = "123456";
	
	
	public static Connection getConnection() {

		Connection conn = null;
		PreparedStatement stmt = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			return conn;

			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		return null;
	
	}

}