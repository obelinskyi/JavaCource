package com.example.java.c01_exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The code is finished");

        try {
            new Main().doSomething();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doSomething() throws InterruptedException {
        Thread.sleep(1000);
    }
}
