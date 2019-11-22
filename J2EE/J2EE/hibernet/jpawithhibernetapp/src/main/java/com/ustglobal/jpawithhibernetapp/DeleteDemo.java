package com.ustglobal.jpawithhibernetapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class DeleteDemo {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			Product productInfo = entityManager.find(Product.class, 101);
			entityManager.remove(productInfo);
			System.out.println("Record deleted");
			entityTransaction.commit();
			
		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}
