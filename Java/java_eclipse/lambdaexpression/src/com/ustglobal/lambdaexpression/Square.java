package com.ustglobal.lambdaexpression;

public class Square {

	public static void main(String[] args) {

		SquareInterface s = (a) -> a * a;
		System.out.println(s.square(10));
	}

}
