package designpatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CounterThread {
    private static int counter = 0;


    static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        int availableProcessors = Runtime.getRuntime().availableProcessors() - 1;
        System.out.println("Cores : " + (availableProcessors));
        CountDownLatch countDownLatch = new CountDownLatch(availableProcessors);
        List<Thread> threads = new ArrayList<>();
            for (int i = 0; i < availableProcessors; i++) {
                Thread t = new Thread(() -> {
                    for (int j = 0; j < 10000; j++) {
                        increment();
                    }
                    countDownLatch.countDown();
                });
                t.start();
                threads.add(t);
            }

//        for (Thread thread : threads) {
//            thread.join();
//        }
        countDownLatch.await();
        System.out.println(counter);
    }
}
