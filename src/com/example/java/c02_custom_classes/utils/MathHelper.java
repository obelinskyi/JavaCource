package com.example.java.c02_custom_classes.utils;

;

public class MathHelper {
    private int total;
//    public static final int ADD = 1001;
//    public static final int SUBTRACT = 1002;

    public int getTotal() {
        return this.total;
    }

    public MathHelper() {
        this.total = 50;
        System.out.println("Total is: " + total);
    }

    public MathHelper(int total) {
        this();
        this.total += total;
        System.out.println("Total is: " + this.total);
    }

    public int addNumber(String prompt) throws NumberFormatException {
        String userInput = InputHelper.getUserInput(prompt);
        int userInputInt = Integer.parseInt(userInput);
        this.total += userInputInt;
        return userInputInt;
    }

    public int doMath(String prompt, Operation operation) throws NumberFormatException {
        String input = InputHelper.getUserInput(prompt);
        int value = Integer.parseInt(input);

        switch (operation) {
            case ADD:
                this.total += value;
                break;
            case SUBTRACT:
                this.total -= value;
                break;
        }
        return value;
    }

    public enum Operation {ADD, SUBTRACT;}
}
