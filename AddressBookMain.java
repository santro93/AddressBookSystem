package com.bridgelabz.addressbooksystem;

import java.util.Scanner;
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program!");
		
		Scanner sc = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();
		int option;
		do {
			System.out.println("-------------------------------------------------");
			System.out.println("Press\n1. To add a new contact \n2. To display contact \n3. To edit contact \n4. To delete a contact \n5. To exit");
			option = sc.nextInt();
			sc.nextLine();
			switch (option) {
				case 1:
					addressBook.addContact(sc);
					break;
				case 2:
					addressBook.displayContact();
					break;
				case 3:
					addressBook.editContact();
					break;
				case 4:
                    addressBook.deleteContact();
                    break;	
				default:
					System.out.println("Enter a valid option");
					break;
				}
		}
		while (option != 5);}
}
