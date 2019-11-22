package com.ustglobal.beanobject.bean;

public class Database {

	void receive(Student s) {

		System.out.println("Id is "+s.getId());
		System.out.println("Name is "+s.getName());
		System.out.println("Rollno is "+s.getRollno());
		System.out.println("-----------");
	}
	void save(Employee e) {

		System.out.println("Employee id  is "+e.getId());
		System.out.println("Employee name  is "+e.getName());
		System.out.println("Employee salary  is "+e.getSalary());
		System.out.println("Employee deptartment  is "+e.getDept());
		System.out.println("Employee designation  is "+e.getDesignation());
		System.out.println("-----------");
	}
}
