package com.ustglobal.jpawithhibernetapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		/*
		 * find() method use to retrieve data from database first arg will Entity class
		 * name and other will be primary key
		 */
		Product productDetail = entityManager.find(Product.class, 101);
		System.out.println("Product ID : "+productDetail.getPid());
		System.out.println("Product Name : "+productDetail.getPname());
		System.out.println("Product Quantity : "+productDetail.getQuantity());
		
	} // end of main
} // end of class
