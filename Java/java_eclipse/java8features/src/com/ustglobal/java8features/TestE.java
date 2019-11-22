package com.ustglobal.java8features;

import java.util.function.Supplier;

public class TestE {

	public static void main(String[] args) {

		Supplier<Student> s = () -> new Student(2, "Rahul", 84);
		
		Student s1 = s.get();
		System.out.println("ID : "+s1.id);
		System.out.println("Name : "+s1.name);
		System.out.println("Percentage : "+s1.percentage);
		
		Supplier<Integer> i = () -> 20;
		int val = i.get();
		System.out.println("Value is : "+val);
		
		Supplier<String> str = () -> "Good morning";
		String val1 = str.get();
		System.out.println("Value is : "+val1);
	}
}
