package javaassignment;

import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {

		Object[] obj = new Object[5];
		obj[0] = 10;
		obj[1] = "Sonu";
		obj[2] = true;
		obj[3] = null;
		obj[4] = 11.5;
		
		System.out.println("<<--Iteration using for loop--->>");
		for(int i = 0; i<obj.length; i++) {
			
			System.out.println(obj[i]);
		}
		
		System.out.println("<<--Iteration using for-each loop--->>");
		for(Object value : obj) {
			
			System.out.println(value);
		}
	}

}
