package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Sonu");
		hs.add("Pankaj");
		hs.add("Rahul");
		hs.add("Michel");
		
		System.out.println("<<-------- Using for-each loop ------->>");
		for(Object o : hs) {
			
			System.out.println(o);
		}
		
		System.out.println("<<-------- Using iterator ------->>");
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			
			Object o = i.next();		
			System.out.println(o);
		}
	}
}
