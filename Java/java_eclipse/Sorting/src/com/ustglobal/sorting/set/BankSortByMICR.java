package com.ustglobal.sorting.set;

import java.util.Comparator;

public class BankSortByMICR implements Comparator<Bank> {

	@Override
	public int compare(Bank b1, Bank b2) {
		
		Long l1 = b1.micr;
		Long l2 = b2.micr;
		
		return l1.compareTo(l2);
	}
}
