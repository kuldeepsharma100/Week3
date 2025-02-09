package runtimeanalysis.searchingalgorithm;

import java.util.Arrays;
import java.util.Random;

public class LinearBinaryComparison {
    public static void main(String[] args) {
        int arr[] = new int[1000];
        Random random = new Random();

        for(int i = 0 ; i<1000; i++){
            arr[i] = random.nextInt(1000);
        }

        int target = 495;
        long startTime = System.nanoTime();
        LinearSearch.linearSearch(arr,target);
        long endTime = System.nanoTime();

        System.out.println("linear search time is "+ (endTime - startTime) + " ns");
        Arrays.sort(arr);
        startTime = System.nanoTime();

        BinarySearch.binarySearch(arr, target);
        endTime = System.nanoTime();
        System.out.println("Binary search time is "+ (endTime - startTime)+ " ns");
    }
}
