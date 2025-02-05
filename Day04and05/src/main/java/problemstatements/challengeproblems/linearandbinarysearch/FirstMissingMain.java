package problemstatements.challengeproblems.linearandbinarysearch;

public class FirstMissingMain {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        int arr1[] = {1,3, 5,7};
        int res = FirstMissingPositiveInteger.firstMissingPositive(arr);
        System.out.println("First positive missing number is " + res);
        int result = FirstMissingPositiveInteger.binarySearch(arr1, 5);
        System.out.println("The index of the target number is " + result);
    }
}
