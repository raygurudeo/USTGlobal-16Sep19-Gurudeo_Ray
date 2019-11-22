package com.ustglobal.immutable;

public class TestMyString {

	public static void main(String[] args) {

		MyString ms = new MyString(11, "Sonu");
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		System.out.println(ms);
		
		MyString ms1 = ms.changeContent(12, "Rahul");
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		System.out.println("-----------");
		
		System.out.println(ms1.getName());
		System.out.println(ms1.getRollNo());
		
	}

}
