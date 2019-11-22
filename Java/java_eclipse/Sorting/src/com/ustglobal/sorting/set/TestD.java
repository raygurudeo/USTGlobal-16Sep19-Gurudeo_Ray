package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {

		LinkedHashSet<Double> set = new LinkedHashSet();
		set.add(12.3);
		set.add(25.5);
		set.add(10.4);
		set.add(84.0);
		
		System.out.println("<<-------- Using for-each loop ------->>");
		for(Double d : set) {
			
			System.out.println(d);
		}
		
		System.out.println("<<-------- Using iterator ------->>");
		Iterator<Double> i = set.iterator();
		while(i.hasNext()) {
			
			Double d = i.next();
			System.out.println(d);
		}
		
	}

}
