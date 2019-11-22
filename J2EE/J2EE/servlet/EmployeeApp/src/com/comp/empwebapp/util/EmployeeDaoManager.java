package com.comp.empwebapp.util;

import com.comp.empwebapp.dao.EmployeeDAO;
import com.comp.empwebapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {

	private EmployeeDaoManager() {
		
	}
	
	public static EmployeeDAO getEmployeeDAO() {
		
		return new EmployeeDaoJdbcImpl();
	}
}
