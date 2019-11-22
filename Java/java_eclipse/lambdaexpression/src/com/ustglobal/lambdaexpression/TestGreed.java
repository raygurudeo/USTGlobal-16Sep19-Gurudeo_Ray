package com.ustglobal.lambdaexpression;

public class TestGreed {

	public static void main(String[] args) {

		GreetInterface greet = (message) -> {
			
			System.out.println("Hello");
			System.out.println(message);
		};
		greet.greet("Tony");
	}

}
