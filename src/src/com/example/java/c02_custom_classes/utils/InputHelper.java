package com.example.java.c02_custom_classes.utils;

import java.util.Scanner;

public class InputHelper {
    public static String getUserInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
