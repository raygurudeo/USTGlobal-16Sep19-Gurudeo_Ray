package com.ustglobal.jpawithhibernetapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class GetRefrence {

public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		/*
		 * find() method use to retrieve data from database first arg will Entity class
		 * name and other will be primary key
		 */
		Product product = entityManager.getReference(Product.class, 102);
		System.out.println("ID : "+product.getPid());
		System.out.println("Name : "+product.getPname());
		System.out.println("Quantity : "+product.getQuantity());
		
	} // end of main
}
