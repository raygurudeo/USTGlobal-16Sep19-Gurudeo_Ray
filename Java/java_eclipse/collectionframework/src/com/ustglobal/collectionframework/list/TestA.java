package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
public class TestA {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(12);
		al.add(22.5);
		al.add("Chinnu");
		al.add(true);
		al.add(null);
		al.add('A');
		
		for(int i = 0; i < 6; i++) {
			
			Object o = al.get(i);
			System.out.println(o);
		}
	}

}
