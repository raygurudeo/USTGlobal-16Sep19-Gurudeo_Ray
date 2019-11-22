package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestPen {

	public static void main(String[] args) {

		ArrayList<Pen> li = new ArrayList<Pen>();
		li.add(new Pen(20, "Cello"));
		li.add(new Pen(10, "Link"));
		li.add(new Pen(50, "Parker"));
		li.add(new Pen(30, "Mountain"));
		li.add(new Pen(40, "Gel"));
		
		System.out.println("Before sorting ------>");
		displayPenDetails(li);
		System.out.println("After sorting ------>");
		Collections.sort(li);
		displayPenDetails(li);
	}

	static void displayPenDetails(ArrayList<Pen> p) {
		
		Iterator<Pen> i = p.iterator();
		while(i.hasNext()) {
			
			Pen p1 = i.next();
			System.out.println("Brand : "+p1.brand);
			System.out.println("Price : "+p1.price);
			System.out.println("--------------");
		}
	}
}
