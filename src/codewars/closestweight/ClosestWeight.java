package codewars.closestweight;

import java.util.*;

class ClosestWeight {
    public static int[][] closest(String strng) {
        if (strng == null || strng.length() == 0) return new int[0][];
        int[][] result = new int[2][3];
        List<String> strngArray = Arrays.asList(strng.split("\\s"));
        ArrayList<int[]> collect = strngArray.stream()
                    .sorted(Comparator.comparing(ClosestWeight::calculateWeight))
                .collect(ArrayList::new,
                        (r, s) -> r.add(new int[]{
                                calculateWeight(String.valueOf(s)),
                                strngArray.indexOf(s),
                                Integer.parseInt(String.valueOf(s))}),
                        List::addAll);
        List<Integer> distances = new ArrayList<>();
        for (int i = 0; i < collect.size() - 1; i++) {
            distances.add(Math.abs(collect.get(i)[0] - collect.get(i+1)[0]));
        }
        int minDistanceIndex = distances.indexOf(Collections.min(distances));
        result[0] = collect.get(minDistanceIndex);
        result[1] = collect.get(minDistanceIndex+1);
        if (result[0][1] == result[1][1]) {
            List<String> tmp = strngArray.subList(result[1][1] + 1, strngArray.size());
            result[1][1] += tmp.indexOf(String.valueOf(result[1][2])) + 1;
        }
        return result;
    }

    private static int calculateWeight(String number) {
        int sum = 0;
        return number.chars().map(Character::getNumericValue).sum();
//        for (char c : number.toCharArray()) {
//            sum += Integer.parseInt(String.valueOf(c));
//        }
//        return sum;
    }
}