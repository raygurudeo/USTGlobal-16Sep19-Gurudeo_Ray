package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {

		LinkedHashSet set = new LinkedHashSet();
		set.add(25);
		set.add("Nikita");
		set.add(84.0);
		set.add(35);
		set.add(null);
		set.add(null);

		System.out.println("<<-------- Using for-each loop ------->>");
		for(Object o : set) {

			System.out.println(o);
		}

		System.out.println("<<-------- Using iterator ------->>");
		Iterator i = set.iterator();
		while(i.hasNext()) {

			Object o = i.next();		
			System.out.println(o);
		}
	}
}

