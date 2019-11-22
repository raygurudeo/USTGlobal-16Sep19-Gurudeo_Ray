package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(23);
		al.add(28.5);
		al.add(true);
		al.add("Good evening");
		
		System.out.println("---------Using iterator--------");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			
			Object o1 = it.next();
			System.out.println(o1);
		}

		System.out.println("---------Using For loop--------");
		for(int i = 0; i < 4; i++) {

			Object o = al.get(i);
			System.out.println(o);
		}
	}

}
