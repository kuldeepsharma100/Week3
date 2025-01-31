package stackandqueue.stockspanproblem;

import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop elements from stack while current price is higher than stack top
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, span = i + 1 (all previous elements were smaller)
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());

            // Push current index onto stack
            stack.push(i);
        }
        return span;
    }
}
