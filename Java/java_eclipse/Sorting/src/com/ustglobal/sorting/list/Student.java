package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {

	int id;
	String name;
	double percentage;
	
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
//	@Override
//	public int compareTo(Student s) {		// Comparing based on Id
//		
//		if(this.id > s.id) {
//			
//			return 1;
//		}
//		else if(this.id < s.id) {
//			
//			return -1;
//		}
//		else {
//			
//			return 0;
//		}
//	}
//	@Override
//	public int compareTo(Student s) {	// Comparing based on percentage
//		
//		if(this.percentage > s.percentage) {
//			
//			return 1;
//		}
//		else if(this.percentage < s.percentage) {
//			
//			return -1;
//		}
//		else {
//			
//			return 0;
//		}
//	}
	
//	@Override
//	public int compareTo(Student s) {	// Comparing based on name
//		
//		String str1 = this.name.toUpperCase();
//		String str2 = s.name.toUpperCase();
//		
//		return str1.compareTo(str2);
//		
//	}
	
	@Override
	public int compareTo(Student s) {	// Comparing based on name
		
		Integer i = this.id;	// compareTo() is implemented in Wrapper class
		Integer j = s.id;
		
		return i.compareTo(j);
		
	}
	
}
