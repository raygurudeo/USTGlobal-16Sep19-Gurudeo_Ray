package com.ustglobal.lambdaexpression;

public class Factorial {

	public static void main(String[] args) {
		
		FactorialInterface f = (n) -> (n == 0)?1:n*(n-1);
		System.out.println(f.fact(5));
	}
}
