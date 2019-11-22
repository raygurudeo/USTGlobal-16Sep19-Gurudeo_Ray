package com.ustglobal.beanobject.bean;

public class TestA {

	public static void main(String[] args) {

		Database db = new Database();
		
		Student s = new Student();
		s.setId(101);
		s.setName("Shivgami");
		s.setRollno(1);
		
		db.receive(s);
		
		Employee e = new Employee();
		e.setId(1);
		e.setName("Rahul");
		e.setSalary(50000);
		e.setDept(10);
		e.setDesignation("Developer");
		
		db.save(e);
		
	}

}
