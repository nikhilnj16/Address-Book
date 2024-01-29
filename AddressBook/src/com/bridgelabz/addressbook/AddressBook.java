package com.bridgelabz.addressbook;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        ContactAddress obj = new ContactAddress("nikhil", "jana", "new street", "chennai", 398493, 235453534, "kjadj@gmail.com");
        System.out.println(obj.FirstName);
        System.out.println(obj.PhoneNum);
    }
}
