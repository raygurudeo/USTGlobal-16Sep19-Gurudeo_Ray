package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("Bengaluru",560076);
		lh.put("Patna",800005);
		lh.put("Delhi",100008);
		
		for (Map.Entry<String, Integer> m : lh.entrySet()) {	// Map and Entry is an interface entrySet() returns entry-set
			
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key : "+key+", Value : "+value);
		}
	}

}
