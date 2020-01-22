package com.ustglobal.phonesimulator;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.phonesimulator.dao.ContactDAO;
import com.ustglobal.phonesimulator.dto.ContactBean;
import com.ustglobal.phonesimulator.util.ContactManager;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Press 1 to show all contacts:");
		System.out.println("Press 2 to search for contact(using name):");
		System.out.println("Press 3 to Operate on contact:");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			ContactDAO getContacts = ContactManager.getContactDAO();
			List<ContactBean> contacts = getContacts.getAllContacts();
			for(ContactBean bean : contacts) {
				
				System.out.println("Name : "+bean.getName());
				System.out.println("Number : "+bean.getNumber());
				System.out.println("Group name : "+bean.getGroups());
				System.out.println("----------------");
			}
			break;
		case 2:
			System.out.println("Enter name:");
			String name = sc.next();
			ContactDAO searchContacts = ContactManager.getContactDAO();
			ContactBean bean1 = searchContacts.searchContact(name);
			
			System.out.println("Name : "+bean1.getName());
			System.out.println("Number : "+bean1.getNumber());
			System.out.println("Group name : "+bean1.getGroups());
			
			System.out.println("------------");
			System.out.println("Press 1 to call:");
			System.out.println("Press 2 to message:");
			System.out.println("Enter 3 to go to main menu:");
			
			int userchoice = sc.nextInt();
			switch(userchoice) {
			
			case 1:
				System.out.println("Calling the contact and give the option to end call");
				break;
			case 2:
				System.out.println("Enter a message:");
				String msg = sc.next();
				System.out.println("Message is sending.......");
				break;
			case 3:
				ContactDAO backToMenu = ContactManager.getContactDAO();
				backToMenu.getAllContacts();
			}
			
		case 3:
			System.out.println("Press 1 to add contact:");
			System.out.println("Press 2 to delete contact:");
			System.out.println("Press 3 to edit contact:");
			
			int choice3 = sc.nextInt();
			switch(choice3) {
			
			case 1:
				ContactDAO operateContacts = ContactManager.getContactDAO();
				operateContacts.addContact();
				break;
	
			case 2:
				ContactDAO operateContacts1 = ContactManager.getContactDAO();
				operateContacts1.deleteContact();
				
			case 3:
				ContactDAO operateContacts2 = ContactManager.getContactDAO();
				operateContacts2.editContact();
			}
			
		}
		
	}

}