package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(10, "Rahul");
		Employee e2 = new Employee(12, "Raja");
		Employee e3 = new Employee(7, "Sonu");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Comparator<Employee> cmp = (emp1, emp2) -> {
			
			return emp1.name.compareTo(emp2.name);
		};
		List<Employee> l = al.stream().sorted(cmp).collect(Collectors.toList());
		Iterator<Employee> i = l.iterator();
		while(i.hasNext()) {
			
			Employee e = i.next();
			System.out.println("Id : "+e.id);
			System.out.println("Name : "+e.name);
			System.out.println("-----------");
		}
		
	}

}
