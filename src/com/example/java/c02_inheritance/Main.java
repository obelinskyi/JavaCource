package com.example.java.c02_inheritance;

import com.example.java.c02_inheritance.model.ClothingItem;
import com.example.java.c02_inheritance.model.Product;
import com.example.java.c02_inheritance.model.Shirt;

public class Main {
    public static void main(String[] args) {
//        ClothingItem item = new ClothingItem("Shirt", "L", 19.99);
//        displayProduct(item);

        Shirt shirt = new Shirt("M", 14.99);
        shirt.setPattern("Plaid");
        displayProduct(shirt);
        System.out.println(String.format("Shirt pattern is '%s'", shirt.getPattern()));

        ClothingItem reallyAShirt = new Shirt("S", 12.99);
        displayProduct(reallyAShirt);

        Shirt shirt2 = (Shirt)reallyAShirt;
        shirt2.setPattern("Solid");
        System.out.println(shirt2.getPattern());
    }

    private static void displayProduct(Product product) {
        String output = product.getClass().getSimpleName() + "{" +
                "type='" + product.getType() + '\'' +
                ", size='" + product.getSize() + '\'' +
                ", price=" + product.getPrice() +
                '}';
        System.out.println(output);
    }
}
