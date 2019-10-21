package codewars.powersumdigitterm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSumDig {

    public static long powerSumDigTerm(int n) {
        List<Long> cache = new ArrayList<>();
        boolean terminate = false;
        for (int i = 2; i < 500; i++) {
            for (int j = 2; j < 50; j++) {
                long number = (long) Math.pow(i, j);
                if (sumDigits(number) == i) {
                    cache.add(number);
                }
            }
        }
        Collections.sort(cache);
        return cache.get(n - 1);
    }

    private static int sumDigits(long n) {
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}