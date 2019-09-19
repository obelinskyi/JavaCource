package streamsjava9.ch03_functionalinterfaces;

import java.time.LocalTime;
import java.util.Objects;

public class Supplier {

    public static void main(String[] args) {
        System.out.println(composeHashCodes3("Hello", "world"));
        System.out.println(composeHashCodes3("Hello", null));
    }

    public static String getApplicationStatus() {
        System.out.println("getApplicationStatus");
        return "It's time: " + LocalTime.now();
    }

    public static int composeHashCodes(Object a, Object b) {
        return a.hashCode() ^ b.hashCode();
    }

    public static int composeHashCodes2(Object a, Object b) {
        Objects.requireNonNull(a, "a may not be null! " + getApplicationStatus());
        Objects.requireNonNull(b, "b may not be null! " + getApplicationStatus());
        return a.hashCode() ^ b.hashCode();
    }

    public static int composeHashCodes3(Object a, Object b) {
        Objects.requireNonNull(a, () ->"a may not be null! " + getApplicationStatus());
        Objects.requireNonNull(b, () ->"b may not be null! " + getApplicationStatus());
        return a.hashCode() ^ b.hashCode();
    }



}
