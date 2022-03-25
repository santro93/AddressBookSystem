package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	ArrayList<Contacts> tempList = new ArrayList<>();

	public void addContact(Scanner sc) {
		Contacts contact = new Contacts();
		System.out.print("Enter First Name: ");
		contact.setFirstName(sc.nextLine());
		System.out.print("Enter Last Name: ");
		contact.setLastName(sc.nextLine());
		System.out.print("Enter Address: ");
		contact.setAddress(sc.nextLine());
		System.out.print("Enter City: ");
		contact.setCity(sc.nextLine());
		System.out.print("Enter State: ");
		contact.setState(sc.nextLine());
		System.out.print("Enter Email Id: ");
		contact.setEmail(sc.nextLine());
		System.out.print("Enter Phone number: ");
		contact.setPhone(sc.nextLine());
		System.out.print("Enter Zipcode: ");
		contact.setZip(sc.nextLine());
		tempList.add(contact);
	}
	
	public void displayContact(){
		for (Contacts contact:tempList){
			System.out.println("First name : " +contact.firstName);
			System.out.println("last name : " +contact.lastName);
			System.out.println("Address : " +contact.address);
			System.out.println("City : " +contact.city);
			System.out.println("State : " +contact.state);
			System.out.println("Email Id : " +contact.email);
			System.out.println("Phone number : " +contact.phone);
			System.out.println("Zipcode : "+contact.zip);
		}
	}
}