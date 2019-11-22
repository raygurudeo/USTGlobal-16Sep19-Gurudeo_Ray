package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee s1 = new Employee(101, "Dhoni", 10000);
		Employee s2 = new Employee(100, "Michel", 15000);
		Employee s3 = new Employee(103, "Mike", 8000);
		Employee s4 = new Employee(102, "Sachin", 50000);
		Employee s5 = new Employee(104, "Virat", 30000);
		Employee s6 = new Employee(106, "Hussey", 18000);
		Employee s7 = new Employee(105, "Kane", 40000);
		Employee s8 = new Employee(108, "Brendom", 25000);
		Employee s9 = new Employee(107, "James", 72000);
		
		ArrayList<Employee> empList1 = new ArrayList<Employee>();
		empList1.add(s1);
		empList1.add(s2);
		empList1.add(s3);
		
		ArrayList<Employee> empList2 = new ArrayList<Employee>();
		empList2.add(s4);
		empList2.add(s5);
		empList2.add(s6);
		
		ArrayList<Employee> empList3 = new ArrayList<Employee>();
		empList3.add(s7);
		empList3.add(s8);
		empList3.add(s9);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap();
		hm.put("manager1", empList1);
		hm.put("manager2", empList2);
		hm.put("manager3", empList3);
		
		ArrayList<Employee> manager2 = hm.get("manager2");
		Iterator<Employee> i = manager2.iterator();
		while(i.hasNext()) {
			
			Employee e = i.next();
			System.out.println("ID : "+e.id);
			System.out.println("Name : "+e.name);
			System.out.println("Salary : "+e.salary);
			System.out.println("---------------");
		}
	}

}
