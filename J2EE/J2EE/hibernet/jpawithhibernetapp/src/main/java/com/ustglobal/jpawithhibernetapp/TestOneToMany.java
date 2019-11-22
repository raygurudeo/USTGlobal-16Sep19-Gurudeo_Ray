package com.ustglobal.jpawithhibernetapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetapp.onetomanyormanytoone.Pencil;
import com.ustglobal.jpawithhibernetapp.onetomanyormanytoone.PencilBox;

public class TestOneToMany {

	public static void main(String[] args) {

		PencilBox pbox = new PencilBox();
		pbox.setBid(1);
		pbox.setBname("Apsara");
		
		Pencil pencil1 = new Pencil();
		pencil1.setPid(10);
		pencil1.setColor("Black");
		pencil1.setPbox(pbox);
		
		Pencil pencil2 = new Pencil();
		pencil2.setPid(11);
		pencil2.setColor("Red");
		pencil2.setPbox(pbox);
		
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
			entityManager.persist(pencil1);
			entityManager.persist(pencil2);
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
