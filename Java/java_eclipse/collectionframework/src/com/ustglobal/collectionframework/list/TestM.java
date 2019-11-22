package com.ustglobal.collectionframework.list;

import java.util.*;

public class TestM {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Sonu");
		al.add("Kriti");
		al.add("Akash");
		al.add("Rahul");
		
		System.out.println("Before sort "+al);
		Collections.sort(al);
		System.out.println("After sort "+al);
	}

}
