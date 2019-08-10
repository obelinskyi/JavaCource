package com.example.java.advanced_java.c03_collections;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> letters = new LinkedList<>();
        letters.add("A");
        letters.add("B");
        letters.add(1, "C");
        System.out.println(letters);
        System.out.println(letters.get(2));
        System.out.println(letters.remove("B"));
        System.out.println(letters.remove(5));

    }
}
