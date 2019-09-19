package streamsjava9.ch04_streams;

import streamsjava9.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mike", 2000));
        employees.add(new Employee("Louise", 2700));
        employees.add(new Employee("Ivan", 3800));
        employees.add(new Employee("Petro", 1800));
        employees.add(new Employee("Vasyl", 2500));

        System.out.println("Before:\n" + employees);

        employees.stream()
                .filter(e -> e.getSalary() >= 2500)
                .sorted(Comparator.comparing(Employee::getName))
//                .map(Employee::getName)
                .forEach(System.out::println);
//        Stream.of(employees).forEach(System.out::println);
//        Arrays.stream(new List[]{employees}).forEach(System.out::println);
        employees.parallelStream().forEach(System.out::println);

        Random r = new Random();
        Supplier integerSupplier = r::nextInt;

//        Stream.generate(integerSupplier)
//                .forEach(System.out::println);

        Stream.iterate("a", s -> s + "a")
                .forEach(System.out::println);

//        employees.stream()
//                .flatMap(book -> book.getWords().stream())
//                .distinct()
//                .forEach(System.out::println);

    }

}
