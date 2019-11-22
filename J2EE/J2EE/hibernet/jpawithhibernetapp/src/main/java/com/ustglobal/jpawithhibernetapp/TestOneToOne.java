package com.ustglobal.jpawithhibernetapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;
import com.ustglobal.jpawithhibernetapp.onetoone.Person;
import com.ustglobal.jpawithhibernetapp.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {

		VoterCard vc = new VoterCard();
		vc.setVid(15);
		vc.setName("Pankaj");
		
		Person person = new Person();
		person.setPid(108);
		person.setName("Pankaj");
		person.setvCard(vc);
		
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
			
			VoterCard vCard = entityManager.find(VoterCard.class, 11);
			System.out.println(vCard.getPerson().getPid());

			/* persist() method use to save object data to database */
			entityManager.persist(person);
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
