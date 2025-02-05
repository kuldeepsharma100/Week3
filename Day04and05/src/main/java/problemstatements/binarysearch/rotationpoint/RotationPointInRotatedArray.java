package problemstatements.binarysearch.rotationpoint;

public class RotationPointInRotatedArray {
    public static int rotationPoint(int [] arr){
        int left = 0, right = arr.length -1;
        int mid;
        while(!(left==right)) {
             mid = (left + right)/2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return arr[left];
    }
}
