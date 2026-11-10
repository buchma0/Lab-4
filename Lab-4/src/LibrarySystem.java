class Book {
    final String isbn;
    final String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
}

class Library {
    Book[] collection;

    static int totalLibraryBooks = 0;

    public Library(int capacity) {
        collection = new Book[capacity];
    }

    public void addBooks(Book... newBooks) {
        int addedCount = 0;
        for (int i = 0; i < collection.length && addedCount < newBooks.length; i++) {
            if (collection[i] == null) {
                collection[i] = newBooks[addedCount];
                addedCount++;
                totalLibraryBooks++;
            }
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        System.out.println("\tLibrary system");

        // Initialize two libraries
        Library lib1 = new Library(3);
        Library lib2 = new Library(3);

        // Add multiple books to library 1 using Varargs
        lib1.addBooks(new Book("1", "Book 1"), new Book("2", "Book 2"));

        // Add books to library 2 using Varargs
        lib2.addBooks(new Book("3", "Book 3"));

        System.out.println("Total books: " + Library.totalLibraryBooks);

    }
}
