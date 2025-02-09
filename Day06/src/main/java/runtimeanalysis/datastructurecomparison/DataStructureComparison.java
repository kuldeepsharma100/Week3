package runtimeanalysis.datastructurecomparison;

import java.util.HashSet;
import java.util.TreeSet;

public class DataStructureComparison {
    public static void arraySearch(int arr[] , int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target){
                return;
            }
        }
    }
    public static void hashSetSearch(HashSet<Integer> set, int target){
        if(set.contains(target)){
            return;
        }

    }

    public static void treeSetSearch(TreeSet<Integer> tree, int target){
        if(tree.contains(target)){
            return;
        }
    }
}
