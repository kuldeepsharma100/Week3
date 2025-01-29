package doublylinkedlist.moviemanagementsystem;

public class MovieManagementSystemMain {
    public static void main(String[] args) {
        MovieManagementSystem mv = new MovieManagementSystem();

        // Example usage
        mv.addAtBeginning("salar", " ramu ", 2024, 9.0);
        mv.addAtEnd("sarkar", "rohit", 1999, 8.7);
        mv.addAtPosition(2, "mine", " kuldee", 2020, 8.6);

        System.out.println("Movies in forward order:");
        mv.displayForward();

        System.out.println("\nMovies in reverse order:");
        mv.displayReverse();

        mv.updateRating("sarkar", 9.0);
        mv.searchByDirectorOrRating(" mine", null);

        mv.removeByTitle("mine");

        System.out.println("\nMovies after deletion:");
        mv.displayForward();
    }
}
