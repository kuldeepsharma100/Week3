package runtimeanalysis.concatenationperformance;

public class ConcatenateStringMain {
    public static void main(String[] args) {

        System.out.println("Comparison for operation count 1000");
        long startTime = System.nanoTime();
        ConcatenateString.concatenate(1000);
        long endTime = System.nanoTime();
        System.out.println("The string concatenation time is " + (endTime-startTime));

         startTime = System.nanoTime();
        ConcatenateString.concatenateBuilder(1000);
         endTime = System.nanoTime();
        System.out.println("The string builder concatenation time is " + (endTime-startTime));

         startTime = System.nanoTime();
        ConcatenateString.concatenateBuffer(1000);
         endTime = System.nanoTime();
        System.out.println("The string buffer concatenation time is " + (endTime-startTime));
        System.out.println();

        System.out.println("Comparison for operation count 10000");
         startTime = System.nanoTime();
        ConcatenateString.concatenate(10000);
         endTime = System.nanoTime();
        System.out.println("The string concatenation time is " + (endTime-startTime));

        startTime = System.nanoTime();
        ConcatenateString.concatenateBuilder(10000);
        endTime = System.nanoTime();
        System.out.println("The string builder concatenation time is " + (endTime-startTime));

        startTime = System.nanoTime();
        ConcatenateString.concatenateBuffer(10000);
        endTime = System.nanoTime();
        System.out.println("The string buffer concatenation time is " + (endTime-startTime));
    }
}
