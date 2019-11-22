package com.ustglobal.jpawithhibernetapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class InsertDemo {

	public static void main(String[] args) {

		Product product = new Product();
		product.setPid(101);
		product.setPname("Mobile");
		product.setQuantity(1);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			
			/*
			 * we should pass argument to createEntityManagerFactory() method as name
			 * mentioned in name as <persistent-unit> tag name in persistent.xml file as
			 * <persistence-unit name="test" transaction-type="RESOURCE_LOCAL">
			 */
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			/* entityManager() use to communicate with database */
			entityManager = entityManagerFactory.createEntityManager();
			/* entityTransaction use to perform operation on Database */
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			/* persist() method use to save object data to database */
			entityManager.persist(product);
			System.out.println("Record saved");
			/*
			 * If we do any DML operation we have to commit transaction using
			 * entityTransaction.commit() to save data permanently.
			 */
			entityTransaction.commit();
			
		} catch (Exception e) {

			e.printStackTrace();
			/*
			 * entityTransaction.rollback() us to rollback data whatever data inserted in
			 * database
			 */
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
