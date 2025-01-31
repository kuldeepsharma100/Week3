package hashmapandhashfunction.pairwithgivensum;

public class PairWithSumMain {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        if (PairWithSum.hasPairWithSum(arr, target)) {
            System.out.println("Pair found.");
        } else {
            System.out.println("No pair exists.");
        }
    }
}
