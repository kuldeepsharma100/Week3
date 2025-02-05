package problemstatements.binarysearch.firstandlastoccurance;

public class FirstAndLastOccuranceMain {
    public static void main(String[] args) {
        int arr [] = {1,2,3,3,3,4,5};
        int target = 3;
        int result1 = FirstAndLastOccurance.firstOccurance(arr, target);
        int result2 = FirstAndLastOccurance.lastOccurance(arr,target);
        System.out.println("The first occurance is " + result1);
        System.out.println("The last occurance is " + result2);
    }
}
