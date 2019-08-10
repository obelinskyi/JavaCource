package ch01_exceptions;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");

        try(AutoCloseable a = new AutoCloseable() {
            @Override
            public void close() throws Exception {
                System.out.println();
            }
        }) {
            String nothing = null;
            System.out.println(nothing);
            System.out.println("string length: " + nothing.length());
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw e;
        }

    }
}
