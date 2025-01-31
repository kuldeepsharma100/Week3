package sortingalgorithms.countsort;

public class CountSort {
    //method to sort the array using count sort
    public static int[] countSort(int [] arr){
        int [] count = new int[19];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int [] result = new int[arr.length];
        int index = 0;
        for(int i = 0; i<count.length; i++){
            while(count[i]!=0){
                result[index] = i;
                index++;
                count[i] = count[i] -1;
            }
        }
        return result;
    }
}
