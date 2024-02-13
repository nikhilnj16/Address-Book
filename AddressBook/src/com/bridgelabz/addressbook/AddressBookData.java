package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Comparator;

public class AddressBookData {
    public static   ArrayList<ContactAddress> addressBook = new ArrayList<>();
    public void displayContact(){
        Comparator<ContactAddress> comparator = Comparator.comparing(ContactAddress::getFirstName);
        addressBook.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }
}
