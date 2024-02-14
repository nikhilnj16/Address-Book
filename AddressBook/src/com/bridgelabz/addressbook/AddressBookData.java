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
        System.out.println("Do you want to search persons in a CITY Enter 1 else 0");
        int cityNum = scanner7.nextInt();
        if(cityNum == 1) {
            System.out.println("Enter the city to get details of people in that city");
            scanner7.nextLine();
            String detailsOfCity = scanner7.nextLine();
            addressBook.stream().filter(i -> i.getCity().equals(detailsOfCity))
                    .forEach(System.out::println);
        }
        else{
            System.out.println();
        }
    }
    public void displayAllCityDetails(){
        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Do you want to search persons in ALL CITY Enter 1 else 0");
        int allCityNum = scanner8.nextInt();
        if(allCityNum == 1) {
            addressBook.stream().map(i -> i.getCity() + " " + i.getFirstName() + " " + i.getLastName())
                    .forEach(System.out::println);
        }
        else{
            System.out.println("Exited from address book");
        }
    }
}
