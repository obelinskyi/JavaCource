package datastructuresandalgorithmes;

import java.util.Arrays;

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

    static int partition(Integer[] numbers, int start, int end) {
        int pivot = numbers[end];
        int i = start;
        for (int j = start; j < end; j++) {
            if (numbers[j] <= pivot) {
                int tmp = numbers[j];
                numbers[j] = numbers[i];
                numbers[i] = tmp;
                i++;
            }
        }
        numbers[end] = numbers[i];
        numbers[i] = pivot;
        return i;
    }

    static void quick_sort(Integer[] numbers, int start, int end) {
        if (start < end) {
            int pivot = partition(numbers, start, end);
            quick_sort(numbers, start, pivot-1);
            quick_sort(numbers, pivot+1, end);
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 6, 4, 10, 3, 2};
        Integer[] array2 = {9, 6, 4, 10, 3, 2, 12, 1, 55, 97, 0};
        bubbleSort(array.clone());
        selectingSort(array.clone());
        insertionSort(array.clone());
        quick_sort(array2, 0, array2.length-1);
        System.out.println(Arrays.toString(array2));

    }
}
