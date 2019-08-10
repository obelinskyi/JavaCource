package com.example.java.c04_managa_data_collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> states = new ArrayList<>();
        states.add("California");
        states.add("Oregon");
        states.add("Washington");
//        for (String state: states) {
//            System.out.println(state);
//        }

        List<Integer> ints = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i<10; i++) {
            ints.add(rd.nextInt(100));
        }
//        System.out.println(ints);
//        System.out.println(states);

        Map<String, String > map = new HashMap<>();
    }
}

