package com.example.java.c02_inheritance.model;

import com.example.java.c02_inheritance.model.ClothingItem;

public class Shirt extends ClothingItem {
    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Shirt(String size, double price) {
        super("Shirt", size, price);
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() +" {" +
                "pattern='" + pattern + '\'' +
                '}';
    }
}
