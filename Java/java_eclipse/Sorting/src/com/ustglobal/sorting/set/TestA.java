package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(10);
		hs.add("Deepa");
		hs.add(84.0);
		hs.add(null);
		hs.add(true);
		
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
