package com.bridgelabz.addressbook;

public class ContactAddress {
    //instant variables
    String FirstName;
    String LastName;
    String Address;
    String City;
    int Zip;
    long PhoneNum;
    String Email;

    // constructor
    public ContactAddress(String firstName, String lastName, String address, String city, int zip, long phoneNum, String email) {
        FirstName = firstName;
        LastName = lastName;
        Address = address;
        City = city;
        Zip = zip;
        PhoneNum = phoneNum;
        Email = email;
    }

    @Override
    public String toString() {
        return "ContactAddress{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", Zip=" + Zip +
                ", PhoneNum=" + PhoneNum +
                ", Email='" + Email + '\'' +
                '}';
    }
}
