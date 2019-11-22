package com.ustglobal.array;

public class TestB {

	public static void main(String[] args) {

		int[] nums = {10, 20, 30, 40, 50};
		//		System.out.println(nums[10]);
		receive(nums);
		int[] values = getArray();
		for(int i = 0; i<values.length; i++) {

			System.out.println(values[i]);
		}
		String[] strValues = {"Rahul", "Sonu"};
		receiveString(strValues);
		
		String[] strValues1 = getString();
		for(int i = 0; i<strValues1.length; i++) {

			System.out.println(strValues1[i]);
		}
		
	}

	static void receive(int[] numbers) {

		for(int i = 0; i<numbers.length; i++) {

			System.out.println(numbers[i]);
		}
	}
	static int[] getArray() {
		int[] val = {1, 2, 3};
		return val;
	}
	static void receiveString(String[] str) {

		for(int i = 0; i<str.length; i++) {

			System.out.println(str[i]);
		}
	}
	static String[] getString() {
		String[] str = {"Rahul", "Sonu"};
		return str;
	}
}
