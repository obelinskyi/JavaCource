package streamsjava9.ch03_functionalinterfaces;

import streamsjava9.Employee;

import java.util.Comparator;

public class ComposingComparator {

    public static void main(String[] args) {
        Comparator<Employee> byName = Comparator.comparing(Employee::getName);
        Comparator<Employee> byName2 = Comparator.comparing(Employee::getName);
        Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);

        Comparator<Employee> firstByNameThenBySalary = byName.thenComparing(bySalary);
    }

}
