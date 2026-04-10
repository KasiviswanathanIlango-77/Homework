
package exceptionhandlingprograms;

import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM myAccount = new ATM(1000.00); // Starting with $1000
        boolean running = true;

        System.out.println("--- Welcome to the Java ATM ---");

        while (running) {
            System.out.println("\n1. Withdraw\n2. Check Balance\n3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    try {
                        myAccount.withdraw(amount);
                    } 
                    catch (InsufficientBalanceException e) {
                        // Handling the exception without crashing the program
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Your current balance is: $" + myAccount.getBalance());
                    break;

                case 3:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}