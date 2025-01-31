package stackandqueue.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMax {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        if (arr.length == 0) return new int[0];

        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove elements that are out of the current window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove smaller elements
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }

            // Add the current element's index
            deque.offer(i);

            // Store the maximum for the current window (starts from index k-1)
            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peek()];
            }
        }
        return result;
    }

}
