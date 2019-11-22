package com.ustglobal.java8features;

import java.util.function.Function;

public class TestD {

	public static void main(String[] args) {

		Function<Integer, Student> f = id -> {
			
			Student s = new Student(11, "Rahul", 45.0);
			s.id = id;
			return s;
		};
		
		Student s = f.apply(27);
		System.out.println("ID : "+s.id);
		System.out.println("Name : "+s.name);
		System.out.println("Percentage : "+s.percentage);
	}

}
