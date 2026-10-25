package Projeckt;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        System.out.println("--- Book Addition Operations ---");
        Book book1 = new Book(1, "Clean Code");
        Book book2 = new Book(2, "Data Structures and Algorithms");
        Book book3 = new Book(3, "Java Programming");

        if (myLibrary.addBook(book1)) System.out.println("Book successfully added. ID: " + book1.getBookId());
        if (myLibrary.addBook(book2)) System.out.println("Book successfully added. ID: " + book2.getBookId());
        if (myLibrary.addBook(book3)) System.out.println("Book successfully added. ID: " + book3.getBookId());

        System.out.println();
        System.out.println("--- Books in the Library ---");
        myLibrary.displayBooks();

        System.out.println();
        System.out.println("--- Borrowing Operation ---");
        if (myLibrary.borrowBook(1)) {
            System.out.println("Book successfully borrowed. ID: 1");
        } else {
            System.out.println("Operation failed: Book is already borrowed or not found.");
        }
        
        // Trying to borrow the same book again
        if (myLibrary.borrowBook(1)) {
            System.out.println("Book successfully borrowed. ID: 1");
        } else {
            System.out.println("This book is already borrowed. ID: 1");
        }

        System.out.println();
        System.out.println("--- Return Operation ---");
        if (myLibrary.returnBook(1)) {
            System.out.println("Book successfully returned. ID: 1");
        } else {
            System.out.println("Operation failed.");
        }

        System.out.println();
        System.out.println("--- Removal Operation ---");
        if (myLibrary.removeBook(3)) {
            System.out.println("Book successfully removed. ID: 3");
        } else {
            System.out.println("Book not found for removal.");
        }

        System.out.println();
        System.out.println("--- Search Operations ---");
        myLibrary.searchBook(2); 
        myLibrary.searchBook("Clean Code"); 
        
        System.out.println();
        System.out.println("--- Final Status ---");
        myLibrary.displayBooks();
        
        System.out.println();
        System.out.println("--- Defensive Programming (Error Handling) Test ---");
        try {
            myLibrary.removeBook(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Successfully caught exception: " + e.getMessage());
        }
    }
}