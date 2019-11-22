package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class BankTest {

	public static void main(String[] args) {

//		BankSortByName sb = new BankSortByName();
		BankSortByPin sp  = new BankSortByPin();
//		BankSortByMICR sm = new BankSortByMICR();
//		TreeSet<Bank> ts = new TreeSet<Bank>(sb);
		TreeSet<Bank> ts = new TreeSet<Bank>(sp);
//		TreeSet<Bank> ts = new TreeSet<Bank>(sp);
		Bank b1 = new Bank("SBI", 2541, 2542156);
		Bank b2 = new Bank("CITI", 2543, 2354875);
		Bank b3 = new Bank("HDFC", 3546, 3589745);
		Bank b4 = new Bank("PAYTM", 8795, 8769547);
		Bank b5 = new Bank("PAYTM", 8795, 8769547);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		System.out.println("<<-------- Using iterator ------->>");
		Iterator<Bank> i = ts.iterator();
		while(i.hasNext()) {
			
			Bank b = i.next();
			System.out.println("Bank name : "+b.name);
			System.out.println("Pincode : "+b.pinCode);
			System.out.println("MICR : "+b.micr);
			System.out.println("-------------");
		}
	}

}
