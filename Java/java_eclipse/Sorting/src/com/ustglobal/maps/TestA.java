package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("Kuku", 9867);
		hm.put("Mala", 8579);
		hm.put("Sheela", 7896);
		
		System.out.println("Data "+hm);
		hm.put("Mala", 8925);
		System.out.println("After modify "+hm);		// Mala's poneNo will be updated
		hm.put("Dimple", 7648);
		System.out.println("After dimple "+hm);
		hm.put(null, 8574);
		System.out.println("After null "+hm);
		hm.put(null, 8675);		
		System.out.println("After 2nd null "+hm);	// null key's value will be updated
		
		Object phNo = hm.get("Sheela");
		System.out.println("Value : "+phNo);	//get() returns value if key does not exist will return null
		
		System.out.println("---------");
		Object phNo1 = hm.get("She");
		System.out.println("Value : "+phNo1);	//get() returns value if key does not exist will return null
		
		Object value = hm.remove("Kuku");
		System.out.println("Value : "+value);
		System.out.println("After remove kuku "+hm);
	}

}
