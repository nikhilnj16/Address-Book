package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class AddressBookData {
    public static   ArrayList<ContactAddress> addressBook = new ArrayList<>();
    public void displayContact(){
        Comparator<ContactAddress> comparator = Comparator.comparing(ContactAddress::getFirstName);
        addressBook.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }
    public void displayCityDetails(){
        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Enter the city to get details of people in that city");
        String detailsOfCity = scanner7.nextLine();
        addressBook.stream().filter(i -> i.getCity().equals(detailsOfCity))
                .forEach(System.out::println);
    }
}
