package com.example.java.c02_custom_classes;

import com.example.java.c02_custom_classes.utils.MathHelper;

import static com.example.java.c02_custom_classes.utils.MathHelper.Operation.ADD;

public class Main {
    public static void main(String[] args) {
        try {
            while (true) {
                MathHelper math_helper = new MathHelper(50);
                int userInput = math_helper.doMath("We need your digit: ", ADD);
                String msg = String.format("Passed number is %d; Total is: %d", userInput, math_helper.getTotal());
                System.out.println(msg);
            }
        } catch (NumberFormatException e) {
            System.out.println("All done!");
        }
    }
}

