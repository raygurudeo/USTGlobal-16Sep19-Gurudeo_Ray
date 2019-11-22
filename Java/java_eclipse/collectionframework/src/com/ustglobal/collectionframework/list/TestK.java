package com.ustglobal.collectionframework.list;

import java.util.*;

public class TestK {

	public static void main(String[] args) {

		ArrayList<Double> al = new ArrayList<Double>();
		al.add(12.0);
		al.add(22.0);
		al.add(72.0);
		al.add(22.5);
		al.add(18.0);
		al.add(12.0);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		al.add(2, 54.5);
		System.out.println("After add in 2nd index"+al);
		al.remove(0);
		System.out.println("After removing 0th index"+al);
		al.remove(null);
		System.out.println("After removing null"+al);
		Double d = al.get(4);
		System.out.println("Object at 4th index: "+d);
		al.set(2, 77.6);
		System.out.println("After replacing 2nd index "+al);
//		al.clear();
//		System.out.println("After clear method "+al);
		al.contains(54.6);
		
		List<Double> al1 = new ArrayList<>();
		al1.add(12.3);
		al1.add(23.5);
		al1.add(45.2);
		
		al.addAll(al1);
		System.out.println("After adding al1 into al : "+al);
		
		boolean contain = al.contains(al1);
		System.out.println("Contains all of al1 : "+contain);
		
	}

}
