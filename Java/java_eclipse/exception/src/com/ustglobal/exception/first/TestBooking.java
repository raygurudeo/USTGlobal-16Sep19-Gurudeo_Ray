package com.ustglobal.exception.first;

public class TestBooking {

	public static void main(String[] args) {

		System.out.println("Main started");
		
		Paytm p = new Paytm();
		
		try {
			
			p.book();
			
		}catch(ArithmeticException ae) {
			
			System.out.println("Exception caught in main");
		}
		finally {
			
			System.out.println("Executing finally");
		}
		
		System.out.println("Main Ended");
		
	}

}
