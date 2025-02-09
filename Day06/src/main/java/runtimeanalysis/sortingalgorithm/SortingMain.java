package runtimeanalysis.sortingalgorithm;

import java.util.Random;

public class SortingMain {
    public static void main(String[] args) {


        Random random = new Random();

        System.out.println("Sorting algorithm for data set size 1000");
        int arr[] = new int[1000];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = random.nextInt(1000);
        }
        long startTime = System.nanoTime();
        BubbleSort.bubbleSort(arr);
        long endTime = System.nanoTime();
        System.out.println("bubble sort time : "+ (endTime-startTime));

        for(int i = 0 ; i<arr.length; i++){
            arr[i] = random.nextInt(1000);
        }

        startTime = System.nanoTime();
        QuickSort.quickSort(arr, 0, arr.length-1);
        endTime = System.nanoTime();
        System.out.println("quick sort time : "+ (endTime-startTime));

        for(int i = 0 ; i<arr.length; i++){
            arr[i] = random.nextInt(1000);
        }

        startTime = System.nanoTime();
        MergeSort.divide(arr, 0, arr.length-1);
        endTime = System.nanoTime();
        System.out.println("Merge sort time : "+ (endTime-startTime));
        System.out.println();


        System.out.println("Sorting algorithm for data set size 10000");
        int arr1[] = new int[10000];
        for(int i = 0 ; i<arr1.length; i++){
            arr1[i] = random.nextInt(1000);
        }
         startTime = System.nanoTime();
        BubbleSort.bubbleSort(arr1);
         endTime = System.nanoTime();
        System.out.println("bubble sort time : "+ (endTime-startTime));

        for(int i = 0 ; i<arr1.length; i++){
            arr1[i] = random.nextInt(1000);
        }

        startTime = System.nanoTime();
        QuickSort.quickSort(arr1, 0, arr1.length-1);
        endTime = System.nanoTime();
        System.out.println("quick sort time : "+ (endTime-startTime));

        for(int i = 0 ; i<arr1.length; i++){
            arr1[i] = random.nextInt(1000);
        }

        startTime = System.nanoTime();
        MergeSort.divide(arr1, 0, arr1.length-1);
        endTime = System.nanoTime();
        System.out.println("Merge sort time : "+ (endTime-startTime));


    }
}
