// You are tasked to create a mini-library management system using Java classes, objects, and constructors. 
// The system should:
// Keep track of multiple books. Each book has:
// 
// bookId (int)
// 
// title (String)
// 
// author (String)
// 
// isAvailable (boolean) → true if available, false if borrowed
// 
// Use a constructor to initialize a book when it is added to the library.
// 
// Implement methods:
// 
// display() → Show book details (ID, title, author, availability)
// 
// borrowBook() → Mark as borrowed if available, otherwise show message
// 
// returnBook() → Mark as available
// 
// Create a menu-driven console program with options:

// 1. Add a new book
// 
// 2. Display all books
// 
// 3. Borrow a book
// 
// 4. Return a book
// 
// 5. Exit
// 
// 
// Use array of objects to store books (or ArrayList for advanced version).

import java.util.*;

class Books1 {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    // Constructor
    Books1(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Display book details
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
        System.out.println("-------------------------");
    }

    // Borrow book
    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    // Return book
    void returnBook() {
        isAvailable = true;
        System.out.println("Book returned successfully.");
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Books1> books = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add New Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    books.add(new Books1(id, title, author));
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books in library.");
                    } else {
                        for (Books1 b : books) {
                            b.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = sc.nextInt();

                    boolean foundBorrow = false;

                    for (Books1 b : books) {
                        if (b.bookId == borrowId) {
                            b.borrowBook();
                            foundBorrow = true;
                            break;
                        }
                    }

                    if (!foundBorrow) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    boolean foundReturn = false;

                    for (Books1 b : books) {
                        if (b.bookId == returnId) {
                            b.returnBook();
                            foundReturn = true;
                            break;
                        }
                    }

                    if (!foundReturn) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}