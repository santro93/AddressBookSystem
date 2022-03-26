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
	
	public void editContact() {
        Scanner editScan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number you want to edit\n" +
                    "1.First Name\n" +
                    "2.LastName\n" +
                    "3.Address\n" +
                    "4.City\n" +
                    "5.State\n" +
                    "6.Zip\n" +
                    "7.Phone\n" +
                    "8.Email\n" +
                    "9.Exit Edit function");
            number = editScan.nextInt();
            editScan.nextLine();
            for (Contacts contact : tempList) {
                switch (number) {
                    case 1:
                        System.out.println("Enter the correct First name");
                        String firstName = editScan.next();
                        contact.setFirstName(firstName);
                        break;
                    case 2:
                        System.out.println("Enter the correct Last name");
                        String lastName = editScan.next();
                        contact.setLastName(lastName);
                        break;
                    case 3:
                        System.out.println("Enter the correct Address");
                        String address = editScan.next();
                        contact.setAddress(address);
                        break;
                    case 4:
                        System.out.println("Enter the correct City");
                        String city = editScan.next();
                        contact.setCity(city);
                        break;
                    case 5:
                        System.out.println("Enter the correct State");
                        String state = editScan.next();
                        contact.setState(state);
                        break;
                    case 6:
                        System.out.println("Enter the correct Zip");
                        String zip = editScan.next();
                        contact.setZip(zip);
                        break;
                    case 7:
                        System.out.println("Enter the correct Phone");
                        String phone = editScan.next();
                        contact.setPhone(phone);
                        break;
                    case 8:
                        System.out.println("Enter the correct Email");
                        String email = editScan.next();
                        contact.setEmail(email);
                        break;
                    default:
                        System.out.println("Please input a valid number (1-8)");
                }
            }
        }while (number != 9);
	}
}