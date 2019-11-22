package com.ustglobal.exception.second;

public class TestA {

	public static void main(String[] args) {

		try {
			
			Thread.sleep(5000);
			System.out.println("Inside try");
		
		} catch (InterruptedException e) {
			
			System.out.println("Exception caught");
			e.printStackTrace();
			
		}
	}

}
