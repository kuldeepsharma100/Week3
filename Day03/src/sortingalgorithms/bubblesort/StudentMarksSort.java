package sortingalgorithms.bubblesort;

public class StudentMarksSort {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {  // Swap if elements are in the wrong order
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                }
            }

        }
    }

}
