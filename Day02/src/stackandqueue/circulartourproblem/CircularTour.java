package stackandqueue.circulartourproblem;

public class CircularTour {

    public static int tour(int[] petrol, int[] distance) {
        int totalSurplus = 0;
        int surplus = 0;
        int start = 0;

        // Iterate through each pump
        for (int i = 0; i < petrol.length; i++) {
            surplus += petrol[i] - distance[i];

            // If surplus becomes negative, reset the starting point
            if (surplus < 0) {
                start = i + 1;
                surplus = 0;
            }

            // Add to the total surplus
            totalSurplus += petrol[i] - distance[i];
        }

        // If total surplus is positive or zero, a valid tour is possible
        return totalSurplus >= 0 ? start : -1;
    }
}
