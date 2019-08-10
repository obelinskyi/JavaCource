package com.example.java.advanced_java.c02_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    private static Character[] charArray = {'a', 'b', 'c', 'e', 'f'};
    private static Boolean[] boolArray = {true, true, false, false, true};
    private static Integer[] intArray = {1, 2, 3, 4, 5};

    private static<MyType> List<MyType> arrayToList(MyType[] array, List<MyType> list) {
        for (MyType object: array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> characterList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> booleanList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> integerList = arrayToList(intArray, new ArrayList<>());
        System.out.println(integerList.get(0));
    }
}
