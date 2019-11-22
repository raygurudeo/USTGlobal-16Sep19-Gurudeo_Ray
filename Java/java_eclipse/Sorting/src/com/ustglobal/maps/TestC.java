package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("Bengaluru",560076);
		lh.put("Patna",800005);
		lh.put("Delhi",100008);
		
		System.out.println(lh);
		
		System.out.println("----------");
		Set<String> s = lh.keySet();  	// returns key set and its type(Set)
		for(String key : s) {
			
			System.out.println("Key : "+key);
		}
		
		System.out.println("----------");
		Collection<Integer> values = lh.values();	// return all values type of collection
		for(Integer value : values) {
			
			System.out.println("Value : "+value);
		}
	}

}
