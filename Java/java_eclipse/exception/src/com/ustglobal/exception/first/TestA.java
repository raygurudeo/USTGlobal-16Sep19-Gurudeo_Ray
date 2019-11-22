package com.ustglobal.exception.first;

public class TestA {

	public static void main(String[] args) {

		System.out.println("Main started");
		
		int[] a = {10, 20, 30};
		
		try {
			
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please access valid index");
		}
		
		System.out.println("Main ended");
	}

}
