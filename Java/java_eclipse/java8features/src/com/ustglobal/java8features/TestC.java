package com.ustglobal.java8features;

import java.util.function.Function;

public class TestC {

	public static void main(String[] args) {

		Function<Integer, Integer> f = i -> i*i;	// use Function instead of Predicate if return type other than boolean 
		int res = f.apply(2);						// apply() is a fuction of Function class
		System.out.println("Result : "+res);
	}

}
