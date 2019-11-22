package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student(101, "Dhoni", 65.5);
		Student s2 = new Student(100, "Michel", 55.5);
		Student s3 = new Student(103, "Mike", 68.8);
		Student s4 = new Student(102, "Sachin", 75.5);
		Student s5 = new Student(104, "Virat", 35.5);
		Student s6 = new Student(106, "Hussey", 58.8);
		Student s7 = new Student(105, "Kane", 35.5);
		Student s8 = new Student(108, "Brendom", 95.5);
		Student s9 = new Student(107, "James", 68.7);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s4);
		al2.add(s5);
		al2.add(s6);
		
		ArrayList<Student> al3 = new ArrayList<Student>();
		al3.add(s7);
		al3.add(s8);
		al3.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap();
		hm.put("first", al1);
		hm.put("second", al2);
		hm.put("third", al3);
		
		ArrayList<Student> second = hm.get("second");
		
		Iterator<Student> i = second.iterator();
		while(i.hasNext()) {
			
			Student s = i.next();
			System.out.println("ID : "+s.id);
			System.out.println("Name : "+s.name);
			System.out.println("Percentage : "+s.percentage);
			System.out.println("---------------");
		}
		
	}

}
