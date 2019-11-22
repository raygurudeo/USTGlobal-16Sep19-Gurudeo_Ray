package com.ustglobal.jpawithhibernetapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernetapp.manytomany.Course;
import com.ustglobal.jpawithhibernetapp.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {

		Course course1 = new Course();
		course1.setCid(10);
		course1.setCname("Java");
		
		Course course2 = new Course();
		course2.setCid(11);
		course2.setCname("Angular");
		
		Course course3 = new Course();
		course3.setCid(12);
		course3.setCname("SQL");
		
		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		
		Student student = new Student();
		student.setSid(101);
		student.setName("Rahul");
		student.setCourse(courseList);
		
		
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
			entityManager.persist(student);
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
