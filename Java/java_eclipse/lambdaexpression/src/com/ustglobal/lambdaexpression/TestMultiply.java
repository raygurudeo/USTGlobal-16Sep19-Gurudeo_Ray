package com.ustglobal.lambdaexpression;

public class TestMultiply {

	public static void main(String[] args) {

		MultiplyInterface mul = (a, b) -> a * b;
		System.out.println(mul.multiply(10, 20));
	}

}
