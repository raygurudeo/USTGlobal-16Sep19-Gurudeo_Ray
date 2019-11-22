package com.ustglobal.immutable;

public final class MyString {

	private final int rollNo;
	private final String name;
	
	public MyString(int rollNo, String name) {
		
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		
		return rollNo;
	}
	
	public String getName() {
		
		return name;
	}
	
	public MyString changeContent(int rollNo, String name) {
		
		MyString m = new MyString(rollNo, name);
		return m;
	}
}
