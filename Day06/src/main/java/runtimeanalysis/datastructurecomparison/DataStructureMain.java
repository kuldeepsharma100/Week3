package runtimeanalysis.datastructurecomparison;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class DataStructureMain {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int [1000];
        HashSet<Integer> set = new HashSet<>();
        TreeSet<Integer> tree = new TreeSet<>();

        for(int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(1000);
            set.add(random.nextInt(1000));
            tree.add(random.nextInt(1000));
        }

        int target = 456;
        System.out.println("Comparison for data set size 1000");

        long startTime = System.nanoTime();
        DataStructureComparison.arraySearch(arr,target);
        long endTime = System.nanoTime();
        System.out.println("The array search time is " + (endTime -startTime));

         startTime = System.nanoTime();
        DataStructureComparison.hashSetSearch(set,target);
         endTime = System.nanoTime();
        System.out.println("The Hashset search time is " + (endTime -startTime));

         startTime = System.nanoTime();
        DataStructureComparison.treeSetSearch(tree,target);
         endTime = System.nanoTime();
        System.out.println("The treeset search time is " + (endTime -startTime));
        System.out.println();

        System.out.println("Comparison for data set size 100000");

        int arr1[] = new int [100000];
        HashSet<Integer> set1 = new HashSet<>();
        TreeSet<Integer> tree1 = new TreeSet<>();

        for(int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(1000);
            set.add(random.nextInt(1000));
            tree.add(random.nextInt(1000));
        }

         target = 486;



         startTime = System.nanoTime();
        DataStructureComparison.arraySearch(arr1,target);
         endTime = System.nanoTime();
        System.out.println("The array search time is " + (endTime -startTime));

        startTime = System.nanoTime();
        DataStructureComparison.hashSetSearch(set1,target);
        endTime = System.nanoTime();
        System.out.println("The Hashset search time is " + (endTime -startTime));

        startTime = System.nanoTime();
        DataStructureComparison.treeSetSearch(tree1,target);
        endTime = System.nanoTime();
        System.out.println("The treeset search time is " + (endTime -startTime));
        System.out.println();

        System.out.println("Comparison for data set size 1000000");

        int arr2[] = new int [1000000];
        HashSet<Integer> set2 = new HashSet<>();
        TreeSet<Integer> tree2 = new TreeSet<>();

        for(int i=0; i<arr.length; i++){
            arr[i] = random.nextInt(1000);
            set.add(random.nextInt(1000));
            tree.add(random.nextInt(1000));
        }

        target = 487;



        startTime = System.nanoTime();
        DataStructureComparison.arraySearch(arr2,target);
        endTime = System.nanoTime();
        System.out.println("The array search time is " + (endTime -startTime));

        startTime = System.nanoTime();
        DataStructureComparison.hashSetSearch(set2,target);
        endTime = System.nanoTime();
        System.out.println("The Hashset search time is " + (endTime -startTime));

        startTime = System.nanoTime();
        DataStructureComparison.treeSetSearch(tree2,target);
        endTime = System.nanoTime();
        System.out.println("The treeset search time is " + (endTime -startTime));





    }
}
