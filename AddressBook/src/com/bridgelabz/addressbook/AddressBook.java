package com.bridgelabz.addressbook;

import javax.print.attribute.standard.Chromaticity;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private static ArrayList<ContactAddress> addressBook = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        for(int i=0; i<=10; i++) {
            System.out.println("Do you want to add new contact?");
            int wantToAdd = scanner.nextInt();
            if (wantToAdd == 1) {
                addNewContact();
            }
            else{
                break;
            }
        }
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
        System.out.println("If you want to delete enter 1 else 0");
        Scanner scanner3 = new Scanner(System.in);
        int toDelete = scanner3.nextInt();
        if (toDelete == 1){
            deleteContact();
        }
        else{
            System.out.println("No contact is deleted");
        }

    }
    private static void addNewContact(){

        System.out.println("Enter your details \n Firstname \n lastname \n address \n city \n zip, \n phonenum \n email \n ");
        Scanner scanner5 = new Scanner(System.in);
        String FName = scanner5.nextLine();
        String LName = scanner5.nextLine();
        String Address = scanner5.nextLine();
        String City = scanner5.nextLine();
        int Zip = scanner5.nextInt();
        long Num = scanner5.nextLong();
        // consume the newline character left in the buffer
        scanner5.nextLine();
        String Email = scanner5.nextLine();

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
    private static void deleteContact(){
        System.out.println("Enter the fname of the contact to delete: ");
        Scanner scanner4 = new Scanner(System.in);
        String ContactToDelete = scanner4.nextLine();

        boolean contactFound = false;
        for (ContactAddress contact : addressBook){
            if (contact.getFirstName().equalsIgnoreCase(ContactToDelete)){
                addressBook.remove(contact);
                contactFound = true;
                System.out.println("Contact deleted successfully");
                break;
            }
        }
        if (!contactFound){
            System.out.println("Contact not found");
        }

    }
}

