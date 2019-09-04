package designpatterns;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Interview {
    static String reverseWorlds(String str) {
        if (str == null) return str;
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            StringBuilder currentWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            sb.append(currentWord).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2, 5, 1, 9, 0, 2};
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;
            while(j >= 0 && numbers[j] > numbers[j+1]) {
                int tmp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = tmp;
                j--;
            }
            numbers[j+1] = current;
        }
        System.out.println(Arrays.toString(numbers));
    }

}
