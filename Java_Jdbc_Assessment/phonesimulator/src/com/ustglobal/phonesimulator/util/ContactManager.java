package com.ustglobal.phonesimulator.util;

import com.ustglobal.phonesimulator.dao.ContactDAO;
import com.ustglobal.phonesimulator.dao.ContactDAOImpl;

public class ContactManager {

	public ContactManager() {
		
	}
	public static ContactDAO getContactDAO() {
		return new ContactDAOImpl();
	}
}
