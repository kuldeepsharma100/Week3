package runtimeanalysis.searchingalgorithm;

public class BinarySearch {
    public static void binarySearch(int arr[] , int target){
        int left = 0, right = arr.length-1;
        int mid ;
        while(left<=right){
            mid = left + (right-left)/2;
            if(arr[mid]==target){
                System.out.println("value found");
                return;
            }else if(arr[mid]>target){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
    }
}
