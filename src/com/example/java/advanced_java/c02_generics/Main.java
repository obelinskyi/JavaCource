package com.example.java.advanced_java.c02_generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Vasylyna");
        String name1 = (String) names.get(0);
        System.out.println("First name is: " + name1);
        names.add(7);

        List<String> names2 = new ArrayList<>();
        names2.add("Oleksandr");
        String name2 = names2.get(0);
        System.out.println("Second name is: " + name2);
//        names2.add(7);

        System.out.println(new VarargsSubClass());
    }
}
