package runtimeanalysis.searchingalgorithm;

public class LinearSearch {

    public static void linearSearch(int arr [], int target ){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("vaule found");
                return;
            }
        }
    }
}
