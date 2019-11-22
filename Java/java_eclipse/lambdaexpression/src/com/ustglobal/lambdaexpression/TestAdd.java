package com.ustglobal.lambdaexpression;

public class TestAdd implements AddInterface{

	public static void main(String[] args) {

		TestAdd ta = new TestAdd();
		System.out.println(ta.add(10, 20));
	}

	@Override
	public int add(int a, int b) {
		
		return a + b;
	}

}
