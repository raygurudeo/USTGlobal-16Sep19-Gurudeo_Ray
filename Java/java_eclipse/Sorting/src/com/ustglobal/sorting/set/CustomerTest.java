package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class CustomerTest {

	public static void main(String[] args) {

		CustomerSortById si = new CustomerSortById();
//		CustomerSortByName sn = new CustomerSortByName();
//		CustomerSortBySalary ss  = new CustomerSortBySalary();
//		TreeSet<Customer> ts = new TreeSet<Customer>(sb);
//		TreeSet<Customer> ts = new TreeSet<Customer>(ss);
		
		TreeSet<Customer> ts = new TreeSet<Customer>(si);
		ts.add(new Customer("Virat", 101, 50000));
		ts.add(new Customer("Dhoni", 103, 20000));
		ts.add(new Customer("Sachin", 102, 10000));
		ts.add(new Customer("Rohit", 104, 70000));
		
		System.out.println("<------ using iterator ------->");
		Iterator<Customer> i = ts.iterator();
		while(i.hasNext()) {
			
			Customer c = i.next();
			System.out.println("ID : "+c.id);
			System.out.println("Name : "+c.name);
			System.out.println("Salary : "+c.salary);
			System.out.println("--------------");
		}
	}

}
