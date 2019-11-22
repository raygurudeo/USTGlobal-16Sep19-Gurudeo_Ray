package com.ustglobal.exception.first;

public class TestD {

	public static void main(String[] args) {

		String s = "Hello";
		int[] a = {10, 20, 30};
		int b = 10;
		 
		try {
			
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
			
		}catch(NullPointerException ne) {
			
			System.out.println("Dont play with null");
			
		}catch(ArrayIndexOutOfBoundsException aie) {
			
			System.out.println("Index not present");
			
		}catch(ArithmeticException ae) {
			
			System.out.println("Number is divided by zero");
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
