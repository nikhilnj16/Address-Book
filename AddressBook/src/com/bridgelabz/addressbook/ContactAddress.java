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

    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getAddress(){
        return Address;
    }
    public String getCity(){
        return City;
    }
    public int getZip(){
        return Zip;
    }
    public long getPhoneNum(){
        return PhoneNum;
    }
    public String getEmail(){
        return Email;
    }

    public void setFirstName(String firstName){
        FirstName = firstName;
    }
    public void setLastName(String lastName){
        LastName = lastName;
    }
    public void setAddress(String address){
        Address = address;
    }
    public void setCity(String city){
        City = city;
    }
    public void setZip(int zip){
        Zip = zip;
    }
    public void setPhoneNum(int phoneNum){
        PhoneNum = phoneNum;
    }
    public void setEmail(String email){
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
