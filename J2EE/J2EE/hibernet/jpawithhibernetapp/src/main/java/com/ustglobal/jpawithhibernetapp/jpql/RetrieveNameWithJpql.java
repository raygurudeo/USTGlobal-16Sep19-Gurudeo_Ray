package com.ustglobal.jpawithhibernetapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class RetrieveNameWithJpql {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String qlString = "select pname from Product";
		/*
		 * entityManager.createQuery(qlString) use to retrieve data from database by
		 * accepting JPQL query
		 * 
		 * Here createQuery(qlString) will return String list only
		 * so will store in String generic of List.
		 */
		Query query = entityManager.createQuery(qlString);
		List<String> productList = query.getResultList();
		for(String pName : productList) {
			
			System.out.println(pName);
		}
		entityManager.close();
	}

}
