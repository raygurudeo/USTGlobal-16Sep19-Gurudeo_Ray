package com.ustglobal.hasarelationship.weak;

public class Test {

	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println(p.name);
		p.sleep();
		p.eat();
		System.out.println("-------");
		p.m.write();	// Has-A relationship
	}	
}
