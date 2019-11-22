package com.ustglobal.collectionframework.list;

import java.util.*;

public class TestG {

	public static void main(String[] args) {

		LinkedList li = new LinkedList();
		li.add(12);
		li.add(34.5);
		li.add("Sonu");
		li.add(true);

		System.out.println("<------- Iterate using for loop-------->");
		for (int i = 0; i < li.size(); i++) {

			System.out.println(li.get(i));
		}

		System.out.println("<------- Iterate using for-each loop-------->");
		for (Object obj : li) {

			System.out.println(obj);
		}

		System.out.println("<------- Iterate using iterator -------->");
		Iterator it = li.iterator();
		while(it.hasNext()) {

			System.out.println(it.next());
		}

		System.out.println("<------- Iterate using ListIterator-------->");
		ListIterator lit = li.listIterator();
		while(lit.hasNext()) {

			System.out.println(lit.next());
		}
		
		System.out.println("<------- Iterate using ListIterator(Backward) with previous()-------->");
		while(lit.hasPrevious()) {
			
			System.out.println(lit.previous());
		}
		
	}

}
