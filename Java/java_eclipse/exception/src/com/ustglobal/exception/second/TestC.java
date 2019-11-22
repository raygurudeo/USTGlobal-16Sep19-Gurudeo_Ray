package com.ustglobal.exception.second;

import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		
		try(Scanner sc  = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in)) {  // If we use Scanner obj more than one time
			
			System.out.println("Enter age");
			int age  = sc.nextInt();
			System.out.println("Age : "+age);
			
			System.out.println(age/0);
			
		}catch(ArithmeticException ae) {
			
			System.out.println("Number is divided by zero");
			
		} finally {
			
			System.out.println("Finally executed");
		}
	}

}
