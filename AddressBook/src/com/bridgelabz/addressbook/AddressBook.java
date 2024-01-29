package com.bridgelabz.addressbook;

import javax.print.attribute.standard.Chromaticity;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        Scanner scanner = new Scanner(System.in);

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
        System.out.println(obj);









    }
}
