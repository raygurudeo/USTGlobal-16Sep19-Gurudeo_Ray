package com.ustglobal.exception.customexception;

public class TestAge {

	public static void main(String[] args) {

		System.out.println("Main started");
		
		Validator v = new Validator();
		try {
			
			v.verify(17);
			
		}catch(InvalidAgeException ie) {
			
			System.out.println("Age is below 18");
		}
		
		System.out.println("Main ended");
	}

}
