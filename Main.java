// Book class demonstrating encapsulation
class Book {
    private String title;
    private String author;
    private int pages;

    // Constructor to initialize Book object
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Getter methods (Encapsulation)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    // Method to display book information (Abstraction)
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}

// EBook class extending Book class (Inheritance)
class EBook extends Book {
    private String format;

    // Constructor to initialize EBook object
    public EBook(String title, String author, int pages, String format) {
        super(title, author, pages); // Call parent class constructor
        this.format = format;
    }

    // Getter method for format
    public String getFormat() {
        return format;
    }

    // Overriding the displayInfo method (Polymorphism)
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Format: " + format);
    }
}

// Library class to manage books
class Library {
    private Book[] books;
    private int currentIndex = 0;

    // Constructor to initialize the library with a certain size
    public Library(int size) {
        books = new Book[size];
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (currentIndex < books.length) {
            books[currentIndex++] = book;
        } else {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        for (int i = 0; i < currentIndex; i++) {
            books[i].displayInfo();
            System.out.println("-------------------------------");
        }
    }
}

// Main class to test the Library system
public class Main {
    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        EBook eBook1 = new EBook("Digital Fortress", "Dan Brown", 340, "PDF");
        
        // Create a library and add books
        Library library = new Library(5);
        library.addBook(book1);
        library.addBook(eBook1);
        
        // Display all books in the library
        library.displayAllBooks();
    }
}
