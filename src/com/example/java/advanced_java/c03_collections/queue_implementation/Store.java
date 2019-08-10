package com.example.java.advanced_java.c03_collections.queue_implementation;

import java.util.*;

public class Store {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("July"));
        queue.add(new Customer("Jack"));
        queue.add(new Customer("Nick"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);


        LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Sally", 123123);
        phoneBook.put("Bill", 567567);
        phoneBook.put("Benny", 987654);
        for (Map.Entry<String, Integer> entry: phoneBook.entrySet()) {
            System.out.println(entry);
        }
        System.out.println(phoneBook);
        System.out.println(phoneBook.keySet());
        System.out.println(phoneBook.values());

        System.out.println(phoneBook.remove("Benny"));
        System.out.println(phoneBook);
        System.out.println(phoneBook.remove("Benny"));
        System.out.println(phoneBook);
    }

    private static void serveCustomer(LinkedList<Customer> queue){
        Customer c = queue.poll();
        c.serve();
    }
}
