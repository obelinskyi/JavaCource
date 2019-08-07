package datastructuresandalgorithmes;

import java.util.Arrays;
import java.util.Collections;

public class SortingAlgorithms {
    static void bubbleSort(int[] array) {
        System.out.println("Before sort: " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
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
            while (j >= 0 && array[j] > current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        System.out.println("After sort: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = {9, 6, 4, 10, 3, 2};
        bubbleSort(array.clone());
        selectingSort(array.clone());
        insertionSort(array.clone());

    }
}
