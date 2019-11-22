package com.ustglobal.sorting.set;

import java.util.Comparator;

public class BankSortByName implements Comparator<Bank> {
	
	@Override
	public int compare(Bank arg0, Bank arg1) {
		return arg0.name.compareTo(arg1.name);
	}
}
