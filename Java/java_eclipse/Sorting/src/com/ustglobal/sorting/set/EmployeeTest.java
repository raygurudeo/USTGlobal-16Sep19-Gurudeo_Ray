package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeTest {

	public static void main(String[] args) {

		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee(101, "Mike", 35000);
		Employee e2 = new Employee(102, "Clarke", 20000);
		Employee e3 = new Employee(103, "Virat", 50000);
		Employee e4 = new Employee(104, "Sachin", 40000);
		Employee e5 = new Employee(104, "Sachin", 40000);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println("<<-------- Using iterator ------->>");
		Iterator<Employee> i = hs.iterator();
		while(i.hasNext()) {
			
			Employee e = i.next();
			System.out.println("Id : "+e.id);
			System.out.println("Name : "+e.name);
			System.out.println("Salary : "+e.salary);
			System.out.println("<-------------->");
		}
	}

}
