package com.ustglobal.array;

public class TestA {

	public static void main(String[] args) {

		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2]	= 30;
		nums[3]	= 40;
		nums[4] = 50;
		
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("-----------");
		
		for(int arr : nums) {
			System.out.println(arr);
		}
		System.out.println("-----------");
		
		byte[] nums1 = {11, 22, 33, 44};
		for(int i = 0; i<nums1.length; i++) {
			System.out.println(nums1[i]);
		}
		System.out.println("-----------");
		
		for(byte arr : nums1) {
			System.out.println(arr);
		}
		System.out.println("-----------");
		
		double[] d = {10.0, 12, 12.5, 17.1};
		for(int i = 0; i<d.length; i++) {
			System.out.println(d[i]);
		}
		System.out.println("-----------");
		
		for(double arr : d) {
			System.out.println(arr);
		}
		System.out.println("-----------");
		
		String[] str = {"Kriti", "Ranjeet", "Amrit"};
		for(int i = 0; i<str.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("-----------");
		
		for(String str1 : str) {
			System.out.println(str1);
		}
		System.out.println("-----------");
		
	}

}
