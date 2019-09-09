package advanced_java.c04_functional_interface;

public class Main {
    public static void main(String[] args) {
        GreetingMessage gm = (name) -> System.out.println("Hello " + name);
        gm.greet("Bethan");
        GreetingMessage.test();

        MessagePrinter mp = System.out::println;
        mp.printMessage("Message");
    }
}
