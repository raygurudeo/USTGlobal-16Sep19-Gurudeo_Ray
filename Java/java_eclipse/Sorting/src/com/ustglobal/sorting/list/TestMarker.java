package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMarker {

	public static void main(String[] args) {
		
		ArrayList<Marker> li = new ArrayList<Marker>();
		li.add(new Marker(20, "red"));
		li.add(new Marker(10, "green"));
		li.add(new Marker(50, "black"));
		li.add(new Marker(30, "yellow"));
		li.add(new Marker(40, "violet"));
		
		System.out.println("Before sorting ------>");
		displayMarkerDetails(li);
		System.out.println("After sorting ------>");
		SortByPrice sb = new SortByPrice();
//		SortByColor sc = new SortByColor();
		Collections.sort(li, sb);
//		Collections.sort(li, sc);
		displayMarkerDetails(li);
	}
static void displayMarkerDetails(ArrayList<Marker> p) {
		
		Iterator<Marker> i = p.iterator();
		while(i.hasNext()) {
			
			Marker p1 = i.next();
			System.out.println("Brand : "+p1.color);
			System.out.println("Price : "+p1.price);
			System.out.println("--------------");
		}
	}

}
