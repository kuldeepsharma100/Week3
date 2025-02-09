package runtimeanalysis.sortingalgorithm;

public class QuickSort {

    public static void quickSort(int arr[], int left , int right){
        if(left<right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    public static int partition(int arr[], int left , int right){
        int mid = left-1 ;
        int pivot = right;
        while(left<=right){
            if(arr[left]<=arr[pivot]){
                mid++;
                int temp = arr[mid];
                arr[mid]=arr[left];
                arr[left] = temp;

            }
            left++;
        }

        return mid;
    }
}
