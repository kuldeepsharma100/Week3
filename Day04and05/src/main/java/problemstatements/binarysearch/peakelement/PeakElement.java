package problemstatements.binarysearch.peakelement;

public class PeakElement {
    public static int peakElement(int arr []){
        int left = 0, right = arr.length -1;
        int mid;
        while (left <= right) {
             mid = left + (right - left) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                    (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid];
            }
            // If left neighbor is greater, move left
            else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // If right neighbor is greater, move right
            else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
