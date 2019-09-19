package streamsjava9.ch03_functionalinterfaces;

import streamsjava9.Employee;

import java.util.Comparator;

public class Function {
//    java.util.function.
    public static void main(String[] args) {
        Comparator<Employee> byName = Comparator.comparing(Employee::getName);
    }

}
