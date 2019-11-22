package com.ustglobal.jpawithhibernetapp.jpql;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDataWithJpql {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			String jpqlUpdate = "update Product set pname='Mobile' where pid=102";
			Query query = entityManager.createQuery(jpqlUpdate);
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
