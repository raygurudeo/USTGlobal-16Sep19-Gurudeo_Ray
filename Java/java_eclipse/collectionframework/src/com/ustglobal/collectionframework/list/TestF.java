package com.ustglobal.collectionframework.list;

import java.util.*;

public class TestF {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Anupma");
		al.add("Uma");
		al.add("Sunita");
		al.add("Kavita");

		System.out.println("------Using iterator-------");
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {

			String name = it.next();
			System.out.println(name);
		}
		
		System.out.println("------Using list-iterator-------");
		ListIterator<String> li = al.listIterator();
		while(li.hasNext()) {
			
			String name = li.next();
			System.out.println(name);
		}
	}

}
