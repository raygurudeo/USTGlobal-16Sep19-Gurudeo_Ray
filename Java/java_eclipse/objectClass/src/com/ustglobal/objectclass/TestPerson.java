package com.ustglobal.objectclass;

public class TestPerson {

	public static void main(String[] args) throws CloneNotSupportedException {

		Person p1 = new Person(11, "Chandan");
		System.out.println("P1 id: "+p1.id);
		System.out.println("P1 name: "+p1.name);
		
		Object o = p1.clone();
		Person p2 = (Person)o;
		System.out.println("P2 id: "+p2.id);
		System.out.println("P2 name: "+p2.name);
		
		p2.id = 101;
		p2.name = "Abhi";
		
		System.out.println("---- After cloning -------");
		System.out.println("P1 id: "+p1.id);
		System.out.println("P1 name: "+p1.name);
		System.out.println("P2 id: "+p2.id);
		System.out.println("P2 name: "+p2.name);
	}

}
