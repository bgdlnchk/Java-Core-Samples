package com.java.samples;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 A simple example of Hash Map usage.
 This snippet has a HashMap with <Town, User Name> structure
 and return the name to a user based on the town.

 Created 27.11.2020 by Bogdan Lonchuk
*/

public class HashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();

        HashMap<String, String> usersMap = new HashMap<>();
        usersMap.put("London", "Mark");
        usersMap.put("Berlin", "Brendon");
        usersMap.put("Kyiv", "Pavlo");
        usersMap.put("Brest", "Peter");
        usersMap.put("New York", "John");

        for (Map.Entry<String, String> usersEntry : usersMap.entrySet()) {
            if(usersEntry.getKey().equals(town)){
                System.out.println(usersEntry.getValue());
            }
        }
    }
}
