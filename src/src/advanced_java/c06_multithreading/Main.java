package advanced_java.c06_multithreading;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample());
        thread1.setName("My first thread.");
        thread1.start();

        Runnable run2 = () ->
            IntStream.range(1, 100)
                    .forEach((i) -> System.out.println(String.format("%d " + Thread.currentThread().getName(), i)));

        Thread thread2 = new Thread(run2);
        thread2.setName("My second thread.");
        thread2.start();

        System.out.println(Thread.activeCount());
    }
}
