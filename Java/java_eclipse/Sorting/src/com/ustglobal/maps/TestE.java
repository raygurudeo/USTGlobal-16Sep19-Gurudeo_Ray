package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("Bengaluru",560076);
		tm.put("Patna",800005);
		tm.put("Delhi",100008);
//		tm.put(null, 7894);		// null not allowed will give NullPointerException
		
		for(Map.Entry<String, Integer> m : tm.entrySet()) {
		
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key : "+key);
			System.out.println("Value : "+value);
			System.out.println("----------");
		}
	}

}
