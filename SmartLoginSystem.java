
package exceptionhandlingprograms;

import java.util.Scanner;

// Custom Exception
class AccountLockedException extends Exception {
    public AccountLockedException(String message) {
        super(message);
    }
}

public class SmartLoginSystem {

    static final String USERNAME = "admin";
    static final String PASSWORD = "1234";
    static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    try {
                        login(sc);
                    } catch (AccountLockedException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Exiting system...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void login(Scanner sc) throws AccountLockedException {
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter Username: ");
            String user = sc.nextLine();

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
                System.out.println("Login Successful!");
                return;
            } else {
                attempts++;
                int remaining = MAX_ATTEMPTS - attempts;
                System.out.println("Invalid credentials!");

                if (remaining > 0) {
                    System.out.println("Remaining attempts: " + remaining);
                }
            }
        }

        // Throw exception after max attempts
        throw new AccountLockedException("Account locked! Too many failed attempts.");
    }
}