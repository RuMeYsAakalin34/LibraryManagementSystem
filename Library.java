package Projeckt;

import java.util.HashMap;

public class Library {
    private HashMap<Integer, Book> bookMap = new HashMap<>();

    public boolean addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null!");
        }
        if (book.getBookName() == null || book.getBookName().trim().isEmpty()) {
            throw new IllegalArgumentException("Book name cannot be null or empty!");
        }
        if (book.getBookId() <= 0) {
            throw new IllegalArgumentException("Book ID must be greater than zero!");
        }
        
        if (bookMap.containsKey(book.getBookId())) {
            return false;
        }
        
        bookMap.put(book.getBookId(), book);
        return true;
    }

    public boolean removeBook(int bookId) {
        if (bookId <= 0) {
            throw new IllegalArgumentException("Book ID must be greater than zero!");
        }
        
        return bookMap.remove(bookId) != null;
    }

    public boolean borrowBook(int bookId) {
        if (bookId <= 0) {
            throw new IllegalArgumentException("Book ID must be greater than zero!");
        }
        
        if (bookMap.containsKey(bookId)) {
            Book targetBook = bookMap.get(bookId);
            if (targetBook.getİsAvaliable()) {
                targetBook.setİsAvaliable(false);;
                return true; 
            }
        }
        return false; 
    }

    public boolean returnBook(int bookId) {
        if (bookId <= 0) {
            throw new IllegalArgumentException("Book ID must be greater than zero!");
        }
        
        if (bookMap.containsKey(bookId)) {
            Book targetBook = bookMap.get(bookId);
            if (!targetBook.getİsAvaliable()) {
                targetBook.setİsAvaliable(true);
                return true; 
            }
        }
        return false; 
    }

    public void displayBooks() {
        if (bookMap.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        
        for (Book book : bookMap.values()) {
            System.out.println("ID: " + book.getBookId() + 
                               " Name: " + book.getBookName() + 
                               " Available: " + book.getİsAvaliable());
        }
    }
 
    public void searchBook(int bookId) {
        if (bookId <= 0) {
            throw new IllegalArgumentException("Book ID must be greater than zero!");
        }

        if (bookMap.containsKey(bookId)) {
            Book book = bookMap.get(bookId);
            System.out.println("Book found -> ID: " + book.getBookId() + 
                               " Name: " + book.getBookName() + 
                               " Available: " + book.getİsAvaliable());
        } else {
            System.out.println("Book not found with ID: " + bookId);
        }
    }

    public void searchBook(String bookName) {
        if (bookName == null || bookName.trim().isEmpty()) {
            throw new IllegalArgumentException("Book name cannot be null or empty!");
        }

        boolean found = false;
        for (Book book : bookMap.values()) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                System.out.println("Book found -> ID: " + book.getBookId() + 
                                   " Name: " + book.getBookName() + 
                                   " Available: " + book.getİsAvaliable());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found with name: " + bookName);
        }
    }
}