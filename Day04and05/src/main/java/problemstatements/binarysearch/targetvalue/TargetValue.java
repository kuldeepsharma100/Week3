package problemstatements.binarysearch.targetvalue;

public class TargetValue {
    public static boolean findTargetElement(int [] [] arr, int target){
        int row = arr.length, column = arr[0].length;
        int left = 0, right = row*column-1;
        int mid;
        while (left<=right){
            mid  = (left+right)/2;
            int row1 = mid/column;
            int column1 = mid%column;
            if(target == arr[row1][column1]){
                return true;
            }else if(target<arr[row1][column1]){
                right = mid - 1;

            }else{
                left = mid + 1;
            }

        }

        return false;
    }
}
