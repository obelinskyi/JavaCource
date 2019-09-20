package codewars.nextbiggernumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static long nextBiggerNumber2(long n) {
        char[] s = String.valueOf(n).toCharArray();
        for (int i = s.length - 2; i >= 0; i--) {
            for (int j = s.length - 1; j > i; j--) {
                if (s[j] > s[i]) {
                    char tmp = s[j];
                    s[j] = s[i];
                    s[i] = tmp;
                    Arrays.sort(s, i+1, s.length);
                    return Long.valueOf(String.valueOf(s));
                }
            }
        }
        return -1;
    }


    public static long nextBiggerNumber(long n) {
        System.out.println(n);
        String number = String.valueOf(n);
        for (int i = number.length() - 2; i >= 0; i--) {
            List<String> allCombinations = new ArrayList<>();
            String subNumber = number.substring(i);
            permutations("", subNumber, allCombinations);
            Collections.sort(allCombinations);
            for (String p :
                    allCombinations) {
                if (n < Long.parseLong(number.substring(0, i) + p)) return Long.parseLong(number.substring(0, i) + p);
            }

        }
        return -1;

    }

    private static void permutations(String prefix, String suffix, List<String> result) {
        if (suffix.length() == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < suffix.length(); i++) {
                String current = suffix.substring(i, i + 1);
                String remainingSuffix = suffix.substring(0, i) + suffix.substring(i + 1);
                permutations(prefix + current, remainingSuffix, result);
            }
        }
    }
}