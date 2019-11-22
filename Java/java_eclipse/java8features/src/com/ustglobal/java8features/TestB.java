package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {

		Student s = new Student(1, "Mike", 45.5);
		
		Predicate<Student> p = student -> {
			
			return s.percentage >= 35;
		};
		System.out.println("Result : "+p.test(s));
	}

}
