package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestB {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(23.5);
		al.add(true);
		al.add("Chinna");
		
		for(Object obj : al) {
			
			System.out.println(obj);
		}
	}

}
