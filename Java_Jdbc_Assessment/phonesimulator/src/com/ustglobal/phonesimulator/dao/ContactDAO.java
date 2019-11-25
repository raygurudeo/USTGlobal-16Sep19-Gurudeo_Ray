package com.ustglobal.phonesimulator.dao;

import java.util.*;

import com.ustglobal.phonesimulator.dto.ContactBean;

public interface ContactDAO {

	public List<ContactBean> getAllContacts();
	public ContactBean searchContact(String name);
	public void addContact();
	public void deleteContact();
	public void editContact();
	
}
