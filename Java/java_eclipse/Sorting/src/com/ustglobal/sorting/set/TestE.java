package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(21);
		ts.add(45);
		ts.add(17);
		ts.add(84);
//		ts.add("adeepika");	Can only add single type of generic value either integer or other
		// ClassCastException
//		ts.add(null);	-> NullPointerExeption
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
