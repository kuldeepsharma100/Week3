package sortingalgorithms.quicksort;



public class QuickSort {

    // QuickSort function
    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition function to reorder the array
    private static int partition(double[] prices, int low, int high) {
        double pivot = prices[high];
        int i = low - 1; // Index for smaller elements

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                swap(prices, i, j);
            }
        }

        // Place the pivot in its correct position
        swap(prices, i + 1, high);
        return i + 1;
    }

    // Swap function to swap two elements in the array
    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
