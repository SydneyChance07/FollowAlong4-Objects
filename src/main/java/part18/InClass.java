package part18;

public class InClass {
    public static void main(String[] args) {
        // Creates an array for three books
        Book[] books = new Book[3];

        // Adds three books to the array
        books[0] = new Book("Dune");
        books[1] = new Book("Holes");
        books[2] = new Book("Wonder");

        // Prints each book title
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].title);
        }

        // Creates a shelf
        Shelf shelf = new Shelf();

        // Places each book on the shelf
        for (Book b : books) {
            shelf.place(b);
        }

        // Prints the number of books
        System.out.println("Books on the shelf: " + shelf.count);
    }
}

// Represents a book
class Book {
    String title;

    // Creates a book
    Book(String title) {
        this.title = title;
    }
}

// Represents a bookshelf
class Shelf {
    int count;

    // Places a book on the shelf
    void place(Book b) {
        count++;
        System.out.println("Placed " + b.title + " on the shelf");
    }
}