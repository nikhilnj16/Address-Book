package com.bridgelabz.addressbook;

import javax.print.attribute.standard.Chromaticity;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private static ArrayList<ContactAddress> addressBook = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        addNewContact();
        System.out.println("Want to edit enter 1 or for no edit enter 0");
        int toEdit = scanner.nextInt();

        if (toEdit==1){
            System.out.println("Enter fname to edit");
            Scanner scanner2 = new Scanner(System.in);
            String contactToEdit = scanner2.nextLine();
            editContact(contactToEdit);
            System.out.println("All contacts in the address book");
            for(ContactAddress contact : addressBook){
                System.out.println(contact);
            }
        }
        else {
            System.out.println("No changes done in Contact Data");
        }
    }
    private static void addNewContact(){

        System.out.println("Enter your details \n Firstname \n lastname \n address \n city \n zip, \n phonenum \n email \n ");
        String FName = scanner.nextLine();
        String LName = scanner.nextLine();
        String Address = scanner.nextLine();
        String City = scanner.nextLine();
        int Zip = scanner.nextInt();
        long Num = scanner.nextLong();
        // consume the newline character left in the buffer
        scanner.nextLine();
        String Email = scanner.nextLine();

        ContactAddress obj = new ContactAddress(FName, LName, Address, City, Zip, Num, Email);
        addressBook.add(obj);
        System.out.println("Contact added successfully");

    }
    private static void editContact(String firstName){
        for(ContactAddress contact : addressBook){
            if(contact.getFirstName().equalsIgnoreCase(firstName)){
                System.out.println("Editing contact: " + contact);
                Scanner scanner1 = new Scanner(System.in);

                System.out.println("Enter your details \n Firstname \n lastname \n address \n city \n zip, \n phonenum \n email \n ");
                contact.setFirstName(scanner1.nextLine());
                contact.setLastName(scanner1.nextLine());
                contact.setAddress(scanner1.nextLine());
                contact.setCity(scanner1.nextLine());
                contact.setZip(scanner1.nextInt());
                contact.setPhoneNum((int) scanner1.nextLong());
                scanner1.nextLine();
                contact.setEmail(scanner1.nextLine());
                System.out.println("Contact edited successfully.");
            }

        }
        
    }
}

