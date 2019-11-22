package com.ustglobal.jpawithhibernetapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class RetriveDataWithJpql {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String qlString = "from Product";
		/*
		 * entityManager.createQuery(qlString) use to retrieve data from database by
		 * accepting JPQL query
		 */
		Query query = entityManager.createQuery(qlString);
		List<Product> productList = query.getResultList();
		for(Product product : productList) {
			
			System.out.println(product.getPid());
			System.out.println(product.getPname());
			System.out.println(product.getQuantity());
			System.out.println("--------------");
		}
		entityManager.close();
		
	} // end of main

} // end of class
