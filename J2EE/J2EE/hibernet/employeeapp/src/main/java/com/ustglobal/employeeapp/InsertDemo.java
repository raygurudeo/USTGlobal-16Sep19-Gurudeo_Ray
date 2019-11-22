package com.ustglobal.employeeapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.employeeapp.dto.EmployeeInfo;

public class InsertDemo {

	public static void main(String[] args) {

		EmployeeInfo employeeInfo = new EmployeeInfo();
		employeeInfo.setId(102);
		employeeInfo.setName("Iphone");
		employeeInfo.setEmail("guru@gmail.com");
		employeeInfo.setPassword("123");
		
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
			entityManager.persist(employeeInfo);
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
