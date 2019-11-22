package com.ustglobal.jpawithhibernetapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDataWithJpql {

	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			String jpqlUpdate = "delete from Product where pid=102";
			Query query = entityManager.createQuery(jpqlUpdate);
			int result = query.executeUpdate();
			entityTransaction.commit();
			System.out.println(result+" record deleted");
			
		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();

	}

}
