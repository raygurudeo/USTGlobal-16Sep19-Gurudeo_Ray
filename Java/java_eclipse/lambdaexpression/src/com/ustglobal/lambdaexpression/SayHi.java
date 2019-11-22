package com.ustglobal.lambdaexpression;

public class SayHi {

	public static void main(String[] args) {

		SayHiInterface s = () -> System.out.println("Hi");
		s.sayHi();
	}

}
