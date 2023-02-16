/**
 * 
 */
package com.signify.client;

import com.signify.service.GradeCardService;

/**
 * @author tjkey
 *
 */
public class ApplicationMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradeCardService service = new GradeCardService();
		
		System.out.println(service.Calculatorcpi(10));

	}

}
