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
            int cityFound=0;
            for(ContactAddress contact : addressBook){
                if (contact.getCity().equalsIgnoreCase(detailsOfCity)){
                    cityFound = 1;
                    break;
                }

            }
            if(cityFound == 1) {
                addressBook.stream().filter(i -> i.getCity().equals(detailsOfCity))
                        .forEach(System.out::println);
            }else {
                System.out.println("City not found");
                displayCityDetails();
            }
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

    }
    public void displayNoOfPerInACityDetails(){
        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Do you want to search no of persons in CITY Enter 1 else 0");
        int allCityNum = scanner8.nextInt();
        if(allCityNum == 1) {
            System.out.println("Enter the city");
            scanner8.nextLine();
            String cityName = scanner8.nextLine();
            int cityFound = 0;
            for(ContactAddress contact : addressBook){
                if (contact.getCity().equalsIgnoreCase(cityName)){
                    cityFound = 1;
                    break;
                }
            }
            if (cityFound == 1) {
                long count = addressBook.stream().filter(i -> i.getCity().equals(cityName)).count();
                System.out.println("No of persons in " + cityName + " = " + count);
            }
            else{
                System.out.println("City not found");
                displayNoOfPerInACityDetails();
            }
        }
        else{
            System.out.println("Exited from address book");
        }
    }

}
