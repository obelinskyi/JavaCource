package advanced_java.c07_io.scanerexample;

import java.util.Scanner;

public class PersonCreater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name, age, phone number: ");
        String name = sc.next();
        int age = sc.nextInt();
        long phoneNumber = sc.nextLong();

        System.out.println(new Person(name, age, phoneNumber));


    }
}
