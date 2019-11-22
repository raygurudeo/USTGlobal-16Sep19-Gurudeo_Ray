package com.ustglobal.sorting.set;

import java.util.Comparator;

public class BankSortByPin implements Comparator<Bank> {

	@Override
	public int compare(Bank arg0, Bank arg1) {
		Integer i =  arg0.pinCode;
		Integer j =  arg1.pinCode;
		return i.compareTo(j);
	}
}
