package com.example.java.advanced_java.c02_generics;

public class Varargs {
    private static String item1 = "Apples";
    private static String item2 = "Bananas";
    private static String item3 = "Oranges";
    private static String[] shopping = {"Bread", "Meat", "Milk"};

    private Varargs(String item1, String item2, String item3) {
        System.out.println("Varargs");
    }

    private static void printShoppingList(String... items) {
        for (String item: items) {
            System.out.println(item);
        }
    }

    public String toString() {
        System.out.println();
        String base = super.toString();
        return base + "Varargs";
    }

    public static void main(String[] args) {
        printShoppingList(item1, item2, item3);
        printShoppingList(shopping);
    }
}
