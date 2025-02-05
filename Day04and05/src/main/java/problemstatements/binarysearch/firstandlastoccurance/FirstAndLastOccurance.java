package problemstatements.binarysearch.firstandlastoccurance;

public class FirstAndLastOccurance {
    public static int firstOccurance(int arr [], int target){
        int left = 0, right = arr.length-1, first = -1;
        int mid;
        while(left<=right){
            mid = (left+right)/2;
            if(target == arr[mid]){
                first = mid;
                right = mid-1;
            }else if(arr[mid]<target){
                left = mid +1;
            }else{
                right = mid-1;
            }
        }
        return first;
    }

    public static int lastOccurance(int arr [], int target){
        int left = 0, right = arr.length-1, last = -1;
        int mid;
        while(left<=right){
            mid = (left+right)/2;
            if(target == arr[mid]){
                last = mid;
                left = mid+1;
            }else if(arr[mid]<target){
                left = mid +1;
            }else{
                right = mid-1;
            }
        }
        return last;
    }

}
