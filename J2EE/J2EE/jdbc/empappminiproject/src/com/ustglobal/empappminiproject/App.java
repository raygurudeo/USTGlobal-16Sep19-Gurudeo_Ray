package com.ustglobal.empappminiproject;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {

	public static void main(String[] args) {

		System.out.println("Press 1 to get all employee data.");
		System.out.println("Press 2 to insert employee data.");
		System.out.println("Press 3 to update employee data.");
		System.out.println("Press 4 to delete employee data.");
		System.out.println("Press 5 to search single employee data.");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch (choice) {

		case 1: 
			
			/** Up-casting EmployeeDAOImpl class object to EmployeeDAO
			interface by calling factory method(getEmployeeDAO() present
			in Factory class EmployeeManager.) */
			EmployeeDAO getEmp = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> empData = getEmp.getAllEmployeeData();
			 
			for(EmployeeBean bean : empData) {
				
				System.out.println("ID : "+bean.getId());
				System.out.println("Name : "+bean.getName());
				System.out.println("Salary : "+bean.getSalary());
				System.out.println("Gender : "+bean.getGender());
				System.out.println("---------------");
			}
			break;
			
		case 2:
			
			/** Up-casting EmployeeDAOImpl class object to EmployeeDAO
			interface by calling factory method(getEmployeeDAO() present
			in Factory class EmployeeManager.) */
			EmployeeDAO insertDetail = EmployeeManager.getEmployeeDAO();
			
			System.out.println("Enter Employee details to add data: ");
			System.out.println("Enter ID: ");
			int insertId = sc.nextInt();
			System.out.println("Enter Name: ");
			String insertName = sc.next();
			System.out.println("Enter Salary: ");
			int insertSalary = sc.nextInt();
			System.out.println("Enter Gender: ");
			String insertGender = sc.next();
			
			insertDetail.insertEmployeeData(insertId, insertName, insertSalary, insertGender);
		
		case 5:
			
			/** Up-casting EmployeeDAOImpl class object to EmployeeDAO
			interface by calling factory method(getEmployeeDAO() present
			in Factory class EmployeeManager.) */
			EmployeeDAO searchEmp = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter ID : ");
			int id = sc.nextInt();
			EmployeeBean bean = searchEmp.searchEmployeeData(id);
			
			if (bean != null) {
				
				System.out.println("ID : "+bean.getId());
				System.out.println("Name : "+bean.getName());
				System.out.println("Salary : "+bean.getSalary());
				System.out.println("Gender : "+bean.getGender());
			}
			else {
				
				System.out.println("No data found.");
			}
			break;
			
		default:
			break;

		} // End of switch-case

	} // end of main()
} // end of class
