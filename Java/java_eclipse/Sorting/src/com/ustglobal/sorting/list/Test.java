package com.ustglobal.sorting.list;

import java.util.*;

public class Test {

	public static void main(String[] args) {

		LinkedList<Laptop> li = new LinkedList<Laptop>();
		Laptop lp1 = new Laptop(25000, 4, "HP");
		Laptop lp2 = new Laptop(35000, 4, "Dell");
		Laptop lp3 = new Laptop(20000, 2, "Lenovo");
		Laptop lp4 = new Laptop(85000, 8, "Mac");
		
		li.add(lp1);
		li.add(lp2);
		li.add(lp3);
		li.add(lp4);
		
		System.out.println("Before sorting------->");
		displayLaptopDetails(li);
		System.out.println("After sorting------->");
		Collections.sort(li);
		displayLaptopDetails(li);
	}
	
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		
		Iterator<Laptop> i = l.iterator();
		while(i.hasNext()) {
			
			Laptop lp = i.next();
			System.out.println("Brand is : "+lp.name);
			System.out.println("Ram is : "+lp.ram);
			System.out.println("Price is : "+lp.price);
			System.out.println("-----------------");
		}
	}
}
