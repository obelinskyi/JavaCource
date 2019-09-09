package advanced_java.c04_functional_interface;

@FunctionalInterface
public interface GreetingMessage {
    public void greet(String name);
    public static void test() {
        System.out.println("Test");
    }
}
