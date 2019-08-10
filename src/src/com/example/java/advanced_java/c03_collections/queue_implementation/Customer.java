package com.example.java.advanced_java.c03_collections.queue_implementation;

import java.util.List;

public class Customer {
    private String name;
    private boolean hasBeenServed = false;

    Customer(String name) {
        this.name = name;
    }

    void serve() {
        this.hasBeenServed = true;
        System.out.println(String.format("%s has been served!", name));
    }

    @Override
    public String toString() {
        return name;
    }
}
