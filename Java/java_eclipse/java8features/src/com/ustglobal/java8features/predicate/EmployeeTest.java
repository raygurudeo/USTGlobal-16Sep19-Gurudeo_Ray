package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e = new Employee(101, "Raj", "software developer");
		Predicate<Employee> p = emp -> {
			
			return (emp.designation == "software developer")?true:false;
		};
		System.out.println("Employee is Software developer : "+p.test(e));
	}

}
