package com.bridgelabz.addressbook;

import javax.print.attribute.standard.Chromaticity;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook extends AddressBookData {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ContactManipulation obj = new ContactManipulation();
        System.out.println("Welcome to Address Book");
        for(int i=0; i<=10; i++) {
            System.out.println("Do you want to add new contact? Enter 1 else 0");
            int wantToAdd = scanner.nextInt();
            if (wantToAdd == 1) {
                obj.addNewContact();
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
            obj.editContact(contactToEdit);
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
            obj.deleteContact();
        }
        else{
            System.out.println("No contact is deleted");
        }
        AddressBookData obj1 = new AddressBookData();
        obj1.displayContact();
        obj1.displayCityDetails();
        obj1.displayAllCityDetails();
        obj1.displayNoOfPerInACityDetails();

    }
}

