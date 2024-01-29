package com.bridgelabz.addressbook;

public class ContactAddress {
    String FirstName;
    String LastName;
    String Address;
    String City;
    int Zip;
    long PhoneNum;
    String Email;

    public ContactAddress(String firstName, String lastName, String address, String city, int zip, long phoneNum, String email) {
        FirstName = firstName;
        LastName = lastName;
        Address = address;
        City = city;
        Zip = zip;
        PhoneNum = phoneNum;
        Email = email;
    }
}
