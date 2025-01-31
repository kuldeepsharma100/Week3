package sortingalgorithms.countsort;

import java.util.Scanner;

public class CountSortMain {
    public static void main(String [] args) {
        //create scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter element between 10 and 18");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + (i+1));
            arr[i] = sc.nextInt();
        }
        int arr1 [] = CountSort.countSort(arr);
        //Displaying the result
        for(int i = 0; i<n; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
