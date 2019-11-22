package com.ustglobal.exception.first;

public class TestC {

	public static void main(String[] args) {

		int[] a = {10, 20, 30};
		int b = 10;
		 try {
			 System.out.println(a[3]);
		 }
		 catch(ArrayIndexOutOfBoundsException ai) {
			 System.out.println("Index is not present");
		 }
		 try {
			 System.out.println(b/0);
		 }
		 catch(ArithmeticException ae) {
			 System.out.println("Number divided by zero");
		 }
	}

}
