package com.ustglobal.employeeapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.employeeapp.dto.EmployeeInfo;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		/*
		 * find() method use to retrieve data from database first arg will Entity class
		 * name and other will be primary key
		 */
		EmployeeInfo employeeInfo = entityManager.find(EmployeeInfo.class, 205);
		System.out.println("ID : "+employeeInfo.getId());
		System.out.println("Name : "+employeeInfo.getName());
		System.out.println("Email : "+employeeInfo.getEmail());
		
	} // end of main
} // end of class
