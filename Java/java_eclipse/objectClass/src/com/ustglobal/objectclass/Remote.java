package com.ustglobal.objectclass;

public class Remote {

	void add() {
		System.out.println("Add() method");
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Remote r = new Remote();
		Class c = r.getClass();
		Object o = c.newInstance();
		Remote q = (Remote)o;
		q.add();
	}
}
