package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101, "Sonu", 45.50);
		Student s2 = new Student(102, "Ankita", 60.0);
		Student s3 = new Student(103, "Deepika", 70.0);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println("<------Using for-loop------>");
		for (int i = 0; i < al.size(); i++) {
			
			Student s = al.get(i);
			System.out.println("Id : "+s.id);
			System.out.println("Name : "+s.name);
			System.out.println("Percentage : "+s.percentage);
		}
		
		System.out.println("<------Using foreach-loop------>");
		for(Student s : al) {
			
			System.out.println(s);
		}
		
		System.out.println("<------Using foreach-loop------>");
	}

}
