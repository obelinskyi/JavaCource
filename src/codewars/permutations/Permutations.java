package codewars.permutations;

import java.util.HashSet;
import java.util.Set;

class Permutations {

    public static Set<String> singlePermutations(String s) {
        Set<String> results = new HashSet<>();
        permutations("", s, results);
        return results;
    }

    private static void permutations(String prefix, String suffix, Set<String> results) {

    }


}