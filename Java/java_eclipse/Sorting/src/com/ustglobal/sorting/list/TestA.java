package com.ustglobal.sorting.list;

import java.util.*;

public class TestA {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(104, "sonu", 60.0);
		Student s2= new Student(102, "Sanu", 50.0);
		Student s3 = new Student(103, "rahul", 70.0);
		Student s4 = new Student(101, "Pankaj", 80.0);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("Before sorting---->");
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("After sorting---->");
		displayStudentDetails(al);
		
	}
	
	static void displayStudentDetails(ArrayList<Student> al) {
		
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			
			Student s = it.next();
			System.out.println("Id is : "+s.id);
			System.out.println("Name is : "+s.name);
			System.out.println("Percentage is : "+s.percentage);
			System.out.println("----------------------");
		}
	}

}
