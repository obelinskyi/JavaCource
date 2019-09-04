package datastructuresandalgorithmes;

import com.sun.jdi.ArrayReference;
import javafx.collections.transformation.SortedList;

import java.util.*;

public class SortingAlgorithms2 {


    static void bubbleSort(int[] array) {
        System.out.println("Before sort: " + Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
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
            int lowestIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[lowestIndex]) {
                    lowestIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[lowestIndex];
            array[lowestIndex] = tmp;
        }
        System.out.println("After sort: " + Arrays.toString(array));
    }

    static void insertionSort(int[] array) {
        System.out.println("Before sort: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            int j = i - 1;
            while (j >= 0 && currentNumber < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentNumber;
        }
        System.out.println("After sort: " + Arrays.toString(array));

    }

    static int findNumberRecursive(int[] array, int number) {
        return -1;
    }

    static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }

    static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start;
        for (int j = i; j < end; j++) {
            if (array[j] < pivot) {
                int tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;
                i++;
            }
        }
        array[end] = array[i];
        array[i] = pivot;
        return i;
    }

    static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int middle = array.length / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }

    private static void merge(int[] array, int start, int middle, int end) {
        int[] left = Arrays.copyOfRange(array, start, middle);
        int[] right = Arrays.copyOfRange(array, middle + 1, end);
        int i, j; i = 0; j = 0;
        for (int k = start; k < end; k++) {
            if (left[i] <= right[j]) {
                array[k] = left[i++];
            } else {
                array[k] = right[j++];
            }
        }
    }


    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<>();

        int[] array = {9, 6, 4, 10, 3, 2};
        int[] array2 = {1, 3, 4, 6, 9, 10, 23, 33, 38, 40, 45, 49, 50, 52, 57, 59, 60, 64, 70, 79, 82, 88, 100};
        int[] array3 = {1, 6, 9, 4, 6, 12, 12, 54, 78, 35, 12, 44, 59, 75, 32, 2, 99, 150, 3};
        int[] array4 = {1, 6, 9, 4, 6, 12, 12, 54, 78, 35, 12, 44, 59, 75, 32, 2, 99, 150, 3};
        bubbleSort(array.clone());
        selectingSort(array.clone());
        insertionSort(array.clone());
        System.out.println(findNumberRecursive(array2, 8));
        System.out.println("Before quick sort: " + Arrays.toString(array3));
        quickSort(array3);
        System.out.println("After quick sort: " + Arrays.toString(array3));
        System.out.println("Before merge sort: " + Arrays.toString(array4));
        quickSort(array4);
        System.out.println("After merge sort: " + Arrays.toString(array4));


//        int a = 3;
//        int b = 6;
//        a = a*b;
//        b = a/b;
//        a = a/b;
//        System.out.println(String.format("a is '%d' and b is '%d'", a, b));
    }
}
