import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Overloaded Methods (Polymorphism - Compile-time)
    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        for (Book b : books) {
            b.displayInfo();
        }
    }

    public void issueBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && !b.isIssued()) {
                b.issueBook();
                System.out.println("Book issued: " + title);
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && b.isIssued()) {
                b.returnBook();
                System.out.println("Book returned: " + title);
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }
}
