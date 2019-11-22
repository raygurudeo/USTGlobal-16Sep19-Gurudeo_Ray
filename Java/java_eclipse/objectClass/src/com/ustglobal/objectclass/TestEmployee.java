package com.ustglobal.objectclass;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Rahul", 20000);
		Employee e2 = new Employee(2, "Kriti", 30000);
		Employee e3 = new Employee(1, "Rahul", 20000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		
	}

}
