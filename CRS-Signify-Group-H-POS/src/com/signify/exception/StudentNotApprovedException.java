/**
 * 
 */
package com.signify.exception;

/**
 * @author GROUP H 
 *
 */
public class StudentNotApprovedException extends Exception{
	public  StudentNotApprovedException (String studentName)
	{
		super();
		/**
		 * Message returned when exception is thrown
		 */
		 System.out.println("Student Not Approved "+studentName);
	}
}
