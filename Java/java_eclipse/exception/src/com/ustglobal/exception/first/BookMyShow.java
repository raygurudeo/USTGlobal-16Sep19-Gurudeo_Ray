package com.ustglobal.exception.first;

public class BookMyShow {

	public static void main(String[] args) {

		System.out.println("BMS Started");
		
		PVR p = new PVR();
		try {
			p.book();
			System.out.println("Booking confirmed");
		}
		catch(ArithmeticException ae) {
			System.out.println("Booking failed");
		}
		
		System.out.println("BMS Ended");
	}

}
