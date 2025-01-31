package stackandqueue.sortstackrecursively;
import java.util.Stack;
public class SortStack {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(2);
        stack.push(4);

        System.out.println("Original Stack: " + stack);
        SortStackRecursively.sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}

