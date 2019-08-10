package advanced_java.c06_multithreading.deadlock;

public class Kitchen {
    public static Object spoon = new Object();
    private static Object bowl1 = new Object();

    public static void main(String[] args) {

        Thread cook1 = new Thread(() -> {
            synchronized (spoon) {
                System.out.println("Cook1: Holding the spoon...");
                System.out.println("Cook1: Waiting for bowl...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (bowl1) {
                    System.out.println("Cook1: Holding the spoon and the bowl...");
                }
            }
        });

        Thread cook2 = new Thread(() -> {
            synchronized (spoon) {
                System.out.println("Cook2: Holding the bowl...");
                System.out.println("Cook2: Waiting for spoon...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (bowl1) {
                    System.out.println("Cook2: Holding the spoon and the bowl...");
                }
            }
        });

        cook1.start();
        cook2.start();
    }
}
