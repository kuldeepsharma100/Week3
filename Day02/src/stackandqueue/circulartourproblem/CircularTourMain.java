package stackandqueue.circulartourproblem;

public class CircularTourMain {
    public static void main(String[] args) {
        int[] petrol = {5, 6, 3, 5};
        int[] distance = {6, 5, 3, 5};

        int startPump = CircularTour.tour(petrol, distance);

        if (startPump == -1) {
            System.out.println("No valid tour is possible");
        } else {
            System.out.println("The tour can start at pump " + startPump);
        }
    }

}
