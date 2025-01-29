package doublylinkedlist.librarymanagementsystem;
public class LibraryManagementMain {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        library.addBookAtBeginning("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 101, true);
        library.addBookAtEnd("1984", "George Orwell", "Dystopian", 102, true);
        library.addBookAtPosition("To Kill a Mockingbird", "Harper Lee", "Classic", 103, true, 2);

        System.out.println("Books in Forward Order:");
        library.displayBooksForward();

        System.out.println("\nBooks in Reverse Order:");
        library.displayBooksReverse();

        library.searchBookByTitle("1984");
        library.searchBookByAuthor("Harper Lee");

        library.updateAvailability(101, false);

        System.out.println("\nBooks after updating availability:");
        library.displayBooksForward();

        library.removeBookById(102);

        System.out.println("\nBooks after removing book with ID 102:");
        library.displayBooksForward();

        System.out.println("\nTotal number of books: " + library.countBooks());
    }
}

