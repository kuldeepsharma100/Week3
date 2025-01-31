package hashmapandhashfunction.pairwithgivensum;

import java.util.HashSet;

public class PairWithSum {

    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int required = target - num;

            if (seen.contains(required)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }

}
