package streamsjava9.ch01_intro;

import streamsjava9.Employee;

import java.util.Comparator;

public class Interfaces {

    public static void main(String[] args) {

        Employee mike = new Employee("Mike", 2000),
                louise = new Employee("Louise", 2500);

        Comparator<Employee> byName = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        System.out.println("By name: ");
        System.out.println(byName.compare(mike, louise));

        try {
            byName.compare(mike, null);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        Comparator<Employee> byNameThenNull = Comparator.nullsLast(byName);
        System.out.println("byNameThenNull");
        System.out.println(byNameThenNull.compare(mike, null));

        Comparator<Employee> firstNullThenByNameDescending = byNameThenNull.reversed();
        System.out.println("firstNullThenByNameDescending");
        System.out.println(firstNullThenByNameDescending.compare(mike, louise));
    }

}
