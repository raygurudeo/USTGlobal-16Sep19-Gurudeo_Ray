package com.ustglobal.maps;

import java.util.Hashtable;

public class TestG {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "Vijay");
		ht.put(1256, "Monu");
		ht.put(102, "Sonu");
		ht.put(10000, "Rahul");
//		ht.put(null, "John");	->>>> NullPointerException
//		ht.put(108, null);		->>>> Value also not accepted as null (NullPointerException)
//		Only that abobe point is different from HashMap.
		
		System.out.println("Data : "+ht);
	}

}
