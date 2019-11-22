package com.ustglobal.sorting.set;

import java.util.Comparator;

public class CustomerSortById implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
	
		Integer i1 = c1.id;
		Integer i2 = c2.id;
		
		return i1.compareTo(i2);
	}
}
