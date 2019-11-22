package com.ustglobal.sorting.set;

import java.util.Comparator;

public class CustomerSortBySalary implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {

		Double d1 = c1.salary;
		Double d2 = c2.salary;
		
		return d1.compareTo(d2);
	}
}
