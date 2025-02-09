package runtimeanalysis.fibonaccicomputation;

public class FibonacciMain {
    public static void main(String[] args) {
        System.out.println("Comparison for value 10");
        long startTime = System.nanoTime();
        System.out.println("Using iteration "+Fibonacci.fibonacciIterative(10));
        long endTime = System.nanoTime();
        System.out.println("iterative approach time is " + (endTime-startTime) );

         startTime = System.nanoTime();
        System.out.println("Using recurtion "+Fibonacci.fibonacciRecursive(10));
         endTime = System.nanoTime();
        System.out.println("Recursive approach time is " + (endTime-startTime) );
        System.out.println();

        System.out.println("Comparison for value 30");
         startTime = System.nanoTime();
        System.out.println("Using iteration "+Fibonacci.fibonacciIterative(30));
         endTime = System.nanoTime();
        System.out.println("iterative approach time is " + (endTime-startTime) );

        startTime = System.nanoTime();
        System.out.println("Using recurtion "+Fibonacci.fibonacciRecursive(30));
        endTime = System.nanoTime();
        System.out.println("Recursive approach time is " + (endTime-startTime) );
    }
}
