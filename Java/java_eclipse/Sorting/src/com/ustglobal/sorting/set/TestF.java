package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Roopa");
		ts.add("Jaya");
		ts.add("Sushma");
		ts.add("Sheela");
		
		System.out.println("<<-------- Using for-each loop ------->>");
		for(Object i : ts) {
			
			System.out.println(i);
		}
		
		System.out.println("<<-------- Using iterator ------->>");
		Iterator i = ts.iterator();
		while(i.hasNext()) {
			
			Object o = i.next();
			System.out.println(o);
		}
	}

}
