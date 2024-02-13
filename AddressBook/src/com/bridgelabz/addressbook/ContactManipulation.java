package com.bridgelabz.addressbook;

import java.util.Scanner;

public class ContactManipulation extends AddressBookData {
    public  void addNewContact(){
        System.out.println("Enter your details \n Firstname \n lastname \n address \n city \n zip, \n phonenum \n email \n ");
        Scanner scanner5 = new Scanner(System.in);
        String FName = scanner5.nextLine();
        for (ContactAddress item : addressBook){
            if(FName.equals(item.FirstName)){
                System.out.println("Name already exists");
                System.out.println("Enter your different firstname");
                FName = scanner5.nextLine();
            }
        }
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

    public void editContact(String firstName){
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

    public  void deleteContact(){
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

    public void displayContact(){
        addressBook.stream().sorted().forEach(System.out::println);
    }
}
