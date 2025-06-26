import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        Person user = new User("Rasika", 101);
        Person librarian = new Librarian("Mr. Sharma", 201);

        user.displayRole();
        librarian.displayRole();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    lib.addBook(title, author);  // Method Overloading
                    break;
                case 2:
                    lib.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter title to issue: ");
                    String issue = sc.nextLine();
                    lib.issueBook(issue);
                    break;
                case 4:
                    System.out.print("Enter title to return: ");
                    String ret = sc.nextLine();
                    lib.returnBook(ret);
                    break;
                case 5:
                    System.out.println("Exiting Library System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
