package stackandqueue.sortstackrecursively;

import java.util.Stack;

class SortStackRecursively {

    // Function to sort a stack recursively
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, top);
        }
    }

    // Function to insert an element into the sorted stack
    static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertInSortedOrder(stack, element);
        stack.push(top);
    }
}
