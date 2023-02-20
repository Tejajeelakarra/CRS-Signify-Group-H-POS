/**
 * 
 */
package com.signify.service;

import java.util.*;


/**
 * @author palak
 *
 */
public class UserService implements UserInterface{
	Scanner in = new Scanner(System.in);
	
	public void login() {
		
		
		
		System.out.println("--------LOGIN PAGE-------- ");
        System.out.print("Enter user name: ");    
        String name = in.next();   
        //System.out.println("Name: " + name);
        System.out.print("Enter your Password: ");    
        String pass = in.next();   
        //System.out.println("Password: " + pass); 
        //System.out.print("choose user role: \n");
        System.out.println("Name: " + name);
        System.out.println("Password: " + pass);
	}
	
	
	
	public void updateDetails(int userId)
	{
		System.out.println("Details updated");
	}
	
	public void updatePassword()
	{
		System.out.println("-------UPDATE PASSWORD------");
        System.out.print("Enter user name: ");    
        String name2 = in.next();  
		String password = "abcd@123";
        //System.out.println("-------UPDATE PASSWORD------");
        //Print the string        
        System.out.print("Enter your old password: ");    
        String oldPassword = in.next();   
        
        System.out.print("Enter your new password: ");  
        String newPassword = in.next();  
        
        System.out.println("Enter confirm new password: ");  
        String confpassword = in.next();
        
        if(password.equals(oldPassword) == false || newPassword.equals(confpassword) == false) {
        	System.out.println("Password does not match");
//        	return;
        }
        
        System.out.println("Password updated Successfully!");
		System.out.println("=======================================");
		System.out.println("update password");
	}

}
