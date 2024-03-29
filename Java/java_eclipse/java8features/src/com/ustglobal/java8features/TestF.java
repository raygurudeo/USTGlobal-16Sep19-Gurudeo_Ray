package com.ustglobal.java8features;

import java.util.function.Consumer;

public class TestF {

	public static void main(String[] args) {

		Consumer<Student> c = s -> {
			
			System.out.println("ID : "+s.id);
			System.out.println("Name : "+s.name);
			System.out.println("Percentage : "+s.percentage);
		};
		
		Student s1 = new Student(7, "Michel", 62.2);
		c.accept(s1);
	}

}
