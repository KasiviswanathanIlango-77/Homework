
package advancedjavaapplication;
import java.util.ArrayList;
import java.util.Scanner;
public class LibrarySystemManagement2 {
    static ArrayList<Book2> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    issueBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    deleteBook();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);
    }

    // Add Book
    public static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        // Check unique ID
        for (Book2 b : books) {
            if (b.getId() == id) {
                System.out.println("Book ID already exists!");
                return;
            }
        }

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        books.add(new Book2(id, title, author));
        System.out.println("Book added successfully!");
    }

    // View Books
    public static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book2 b : books) {
            b.display();
        }
    }

    // Search Book
    public static Book2 findBookById(int id) {
        for (Book2 b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public static void searchBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book2 b = findBookById(id);

        if (b != null) {
            b.display();
        } else {
            System.out.println("Book not found!");
        }
    }

    // Issue Book
    public static void issueBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book2 b = findBookById(id);

        if (b == null) {
            System.out.println("Book not found!");
        } else if (b.getStatus().equals("Issued")) {
            System.out.println("Book is already issued!");
        } else {
            b.issueBook();
            System.out.println("Book issued successfully!");
        }
    }

    // Return Book
    public static void returnBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book2 b = findBookById(id);

        if (b == null) {
            System.out.println("Book not found!");
        } else if (b.getStatus().equals("Available")) {
            System.out.println("Book is already available!");
        } else {
            b.returnBook();
            System.out.println("Book returned successfully!");
        }
    }

    // Delete Book
    public static void deleteBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        Book2 b = findBookById(id);

        if (b != null) {
            books.remove(b);
            System.out.println("Book deleted successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }
}
