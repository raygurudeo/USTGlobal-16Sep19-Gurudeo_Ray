package com.ustglobal.singleton;

public class TestSingleton {

	public static void main(String[] args) {

		MySingleton ms = MySingleton.getDbConnection();
		ms.s = "Hello";
		System.out.println("Hash code of ms = "+ms.hashCode());
		
		MySingleton ms1 = MySingleton.getDbConnection();
		ms1.s = "Hi";
		System.out.println("Hash code of ms1 = "+ms1.hashCode());
	}

}
