package com.ustglobal.employeeapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.employeeapp.dto.EmployeeInfo;

public class UpdateDemo {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			EmployeeInfo employeeInfo = entityManager.find(EmployeeInfo.class, 205);
			employeeInfo.setName("Rahul");
			
			System.out.println("Record updated");
			entityTransaction.commit();
			
			
		} catch(Exception e) {
			
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	} // end of main

} // end of class
