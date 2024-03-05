import java.util.ArrayList;

public class Bookshelf {
    public static void main(String[] args) {
        // Creating some Book objects
        Books book1 = new Books("The Beginning After The End", "TurtleMe", "", 1925);
        Books book2 = new Books("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", 1960);

        // Updating information for book1
        book1.setPublisher("Tapas");

        // Displaying information for all books
        System.out.println("Book 1:");
        System.out.println(book1);

        System.out.println("\nBook 2:");
        System.out.println(book2);
    }
}
