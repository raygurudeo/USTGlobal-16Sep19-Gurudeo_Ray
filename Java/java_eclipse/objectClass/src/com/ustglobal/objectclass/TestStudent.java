package com.ustglobal.objectclass;

public class TestStudent {

	public static void main(String[] args) {

		Student s = new Student(10, "Rahul", 84.0);
		System.out.println(s.hashCode());
		System.out.println(s);
	}

}
