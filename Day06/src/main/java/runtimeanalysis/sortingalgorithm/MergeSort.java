package runtimeanalysis.sortingalgorithm;

public class MergeSort {
    public static void divide(int [] arr, int left, int right){
        int mid ;
        if(left <right){
            mid = left + (right-left)/2;
            divide(arr, left, mid);
            divide(arr, mid+1, right);

            merge(arr, left, mid, right);



        }
    }

    public static void merge(int arr[] , int left, int mid , int right){
        int start = left, end = mid+1;
        int temp [] = new int[right-left+1];
        int index = 0;
        while(start<=mid && end<=right){
            if(arr[start]<=arr[end]) {
                temp[index++] = arr[start++];
            }else{
                temp[index++]= arr[end++];
            }

        }

        while(start<=mid){
            temp[index++] = arr[start++];
        }
        while(end<=right){
            temp[index++] = arr[end++];
        }

        for(int i = 0, j=left; i<temp.length; i++,j++){
            arr[j]=temp[i];
        }
    }

}
