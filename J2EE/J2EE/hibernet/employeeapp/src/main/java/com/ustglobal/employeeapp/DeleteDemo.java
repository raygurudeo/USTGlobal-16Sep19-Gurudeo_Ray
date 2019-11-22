package com.ustglobal.employeeapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.employeeapp.dto.EmployeeInfo;

public class DeleteDemo {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			EmployeeInfo employeeInfo = entityManager.find(EmployeeInfo.class, 1);
			entityManager.remove(employeeInfo);
			System.out.println("Record deleted");
			entityTransaction.commit();
			
		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
