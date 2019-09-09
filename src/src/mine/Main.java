package mine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please, input age: ");
        boolean isInputCorrect = false;
        int age = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            try {
                age = in.nextInt();
                break;
            } catch (Exception e) {
                System.out.print("Please, type only integer values\nLet's try again: ");
                in.close();
                in = new Scanner(System.in);
//                if (i == 9) {
//                    throw e;
//                }
            }
        }
        if (0 <= age && age <= 5) {
            System.out.println("Baby");
        } else if (age <= 12) {
            System.out.println("Kid");
        } else if (age <= 19) {
            System.out.println("Teen");
        } else if (age <= 120) {
            System.out.println("Adult");
        } else {
            System.out.println("Do not lye me!");
        }
    }
}
