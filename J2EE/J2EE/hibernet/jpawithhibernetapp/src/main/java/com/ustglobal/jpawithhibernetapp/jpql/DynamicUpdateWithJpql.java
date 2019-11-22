package com.ustglobal.jpawithhibernetapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicUpdateWithJpql {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			String jpqlUpdate = "update Product set pname=:name where pid=:id";
			Query query = entityManager.createQuery(jpqlUpdate);
			query.setParameter("name", "Dell");
			query.setParameter("id", 102);
			int result = query.executeUpdate();
			entityTransaction.commit();
			System.out.println(result+" record updated");
			
		} catch (Exception e) {

			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
