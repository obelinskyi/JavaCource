package streamsjava9.ch05_streamoperations;


import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtering {

    public static void main(String[] args) {
        Random random = new Random();
//        Supplier<Integer> integerSupplier = random::nextInt;
//        Stream.generate(random::nextInt)
//                .filter(n -> n>=0)
//                .distinct()
//                .limit(10)
//                .forEach(System.out::println);
        Optional<Integer> a = Stream.generate(() -> {
            Integer integer = random.nextInt();
            System.out.println("(supplying): " + integer);
            return integer;
        })
                .filter(n -> n > 0)
                .distinct()
                .takeWhile(n -> n > 100000000)
                .sorted()
                .peek(e -> System.out.println("Peek: " + e))
                .reduce((result, b) -> result + b);
//                .collect(Collectors.toList())
//                .findAny();
//                .forEachOrdered(e -> System.out.println("forEachOrdered: " + e));
        System.out.println(a.orElse(null));

        String b = "Hello world by computing with streams";

//        Map<Integer, List<String>> words = Arrays.stream(b.split(" "))
        String words = Arrays.stream(b.split(" "))
//                .sorted(Comparator.comparing(word -> word.charAt(0)))
                .sorted()
//                .collect(Collectors.toCollection());
//                .collect(Collectors.groupingBy(String::length));
                .collect(Collectors.joining(" "));
//                .collect(StringBuilder::new,
//                        (l, r) -> l.append(" ").append(r),
//                        (l, r) -> l.append(" ").append(r));
        System.out.println(words);



    }

}
