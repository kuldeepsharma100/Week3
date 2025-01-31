package stackandqueue.slidingwindow;

public class SlidingWindowMain {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = SlidingWindowMax.maxSlidingWindow(arr, k);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
