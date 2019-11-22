package com.ustglobal.jpawithhibernetapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReattachingDemo {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			Product productDetails = entityManager.find(Product.class, 102);
			/*
			 * entityManager.contains(productDetails) use to find that weather that object
			 * is present or not
			 */
			System.out.println(entityManager.contains(productDetails));
			/* detach() is use to detach connection with DB 
			 * after calling detach() nothing communication will 
			 * happen with DB so we have to reattach with DB
			 * by calling merge() present in EntityManager class
			 * */
			entityManager.detach(productDetails);
			System.out.println(entityManager.contains(productDetails));
			/* merge() is use to re-attach detach object */
			Product productDetails2 = entityManager.merge(productDetails);
			productDetails2.setPname("Laptop");
			System.out.println("Record updated");
			entityTransaction.commit();
			
		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		
		entityManager.close();
		
	} //end of main()

} // end of class
