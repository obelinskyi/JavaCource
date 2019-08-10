package datastructuresandalgorithmes;

import java.util.*;

public class SortingAlgorithms2 {
    static void bubbleSort(int[] array) {
        System.out.println("Before sort: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("After sort: " + Arrays.toString(array));
    }

    static void selectingSort(int[] array) {
        System.out.println("Before sort: " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tmp;
        }
        System.out.println("After sort: " + Arrays.toString(array));
    }

    static void insertionSort(int[] array) {
        System.out.println("Before sort: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        System.out.println("After sort: " + Arrays.toString(array));

    }

    static int findNumberRecursive(int[] array, int number) {
        int indexOfTheMiddle = array.length / 2;
        if (array.length == 1) {
            return array[0] == number ? number : -1;
        }
        if (array[indexOfTheMiddle] == number) {
            return number;
        } else if (number < array[indexOfTheMiddle]) {
            return findNumberRecursive(Arrays.copyOfRange(array, 0, indexOfTheMiddle), number);
        } else {
            return findNumberRecursive(Arrays.copyOfRange(array, indexOfTheMiddle, array.length), number);
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 6, 4, 10, 3, 2};
        int[] array2 = {1, 3, 4, 6, 9, 10, 23, 33, 38, 40, 45, 49, 50, 52, 57, 59, 60, 64, 70, 79, 82, 88, 100};
        bubbleSort(array.clone());
        selectingSort(array.clone());
        insertionSort(array.clone());
        System.out.println(findNumberRecursive(array2, 8));
//        int a = 3;
//        int b = 6;
//        a = a*b;
//        b = a/b;
//        a = a/b;
//        System.out.println(String.format("a is '%d' and b is '%d'", a, b));
    }
}
