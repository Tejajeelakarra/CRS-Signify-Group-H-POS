/**
 * 
 */
package com.signify.service;

/**
 * @author GROUP H
 *
 */
public class PaymentServices implements PaymentInterface {
	public void calculateAmount(){
		System.out.println("amount calculated");
	}
	public void makePayment(){
		System.out.println("payment made");
	}
	public boolean paymentStatus(){

		System.out.println("Returning status");
		boolean status = false;
		return status;
	}
	

}
