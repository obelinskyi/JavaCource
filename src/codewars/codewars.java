package codewars;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class codewars {
    static Map<Character, Integer> countLetters(String str) {
        Map<Character, Integer> letters = new HashMap<>();

        for (char letter : str.toCharArray()) {
            if (letter == ' ') continue;
            letter = Character.toLowerCase(letter);
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }
        return letters;
    }

    public static String mix(String s1, String s2) {
        Map<Character, Integer> s1Letters = countLetters(s1);
        Map<Character, Integer> s2Letters = countLetters(s2);

        Set<Character> s1Keys = new LinkedHashSet<>(s1Letters.keySet());
        s1Keys.retainAll(s2Letters.keySet());

        StringBuilder sb = new StringBuilder();

        for (Character key : s1Keys) {
            if (s1Letters.get(key) <= 1) {
                continue;
            }

            String c = "";
            int numberOfLetters = 0;
            switch (s1Letters.get(key).compareTo(s2Letters.get(key))) {
                case -1:
                    c = "1";
                    numberOfLetters = s1Letters.get(key);
                    break;
                case 0:
                    c = "=";
                    numberOfLetters = s1Letters.get(key);
                    break;
                case 1:
                    c = "1";
                    numberOfLetters = s2Letters.get(key);
                    break;
            }
            sb.append(c).append(":");
            for (int i = 0; i < numberOfLetters; i++) sb.append(key);
        }
        return sb.toString();

    }

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<>();
        int currentIndex = 0;
        while (items.size() > 0) {
            currentIndex = (currentIndex - 1 + k) % items.size();
            result.add(items.remove(currentIndex));
        }
        return result;
    }


    public static int[] isPerfectPower(int n) {
        for (int i = 2; i < 300; i++) {
            for (int j = 2; j <= 300; j++) {
                double poweredNumber = Math.pow(i, j);
                if (poweredNumber > n) break;
                if (poweredNumber == n) return new int[]{i, j};
            }
        }
        return null;
    }
}
