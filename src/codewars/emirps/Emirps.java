package codewars.emirps;

import java.util.*;

class Emirps {

    public static long[] findEmirp(long n) {
        System.out.println(n);
        List<Long> emirps = new ArrayList<>();
        StringBuilder max = new StringBuilder();
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            max.append(9);
        }
        Set<Long> primes = primeGenerator(Long.parseLong(max.toString()));
        for (long prime : primes) {
            if (prime > n) break;
            long reversed = Long.parseLong(new StringBuilder(String.valueOf(prime)).reverse().toString());
            if (reversed != prime && primes.contains(reversed)) emirps.add(prime);
        }
        long[] result = new long[3];
        result[0] = emirps.size();
        result[1] = emirps.size() > 0 ? emirps.get(emirps.size() - 1) : 0;
        result[2] = emirps.stream().reduce(0L, (a, b) -> a + b);
        return result;
    }

    private static Set<Long> primeGenerator(long max) {
        Set<Long> result = new TreeSet<>();
        long current = 13;
        while (current <= max) {
            boolean divided = false;
            for (int i = 2; i * i <= current; i++) {
                if (current % i == 0) {
                    divided = true;
                    break;
                }
            }
            if (!divided) {
                result.add(current);
            }
            current++;
        }
        return result;
    }
}
