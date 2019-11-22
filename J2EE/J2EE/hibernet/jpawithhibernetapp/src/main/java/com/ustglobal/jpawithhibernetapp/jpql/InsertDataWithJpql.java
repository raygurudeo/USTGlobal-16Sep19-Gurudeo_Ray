package com.ustglobal.jpawithhibernetapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertDataWithJpql {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			String jpqlUpdate = "insert into Product (pid, pname, quantity) values(:pid,:pname,:quantity)";
			Query query = entityManager.createQuery(jpqlUpdate);
			query.setParameter("pid", 105);
			query.setParameter("pname", "Headphone");
			query.setParameter("quantity", 2);
			int result = query.executeUpdate();
			entityTransaction.commit();
			System.out.println(result+" record inserted");
			
		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
