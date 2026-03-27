/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaapplication;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    sc.nextLine(); // consume newline
                    String name = sc.nextLine();

                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();

                    System.out.print("Enter Balance: ");
                    double bal = sc.nextDouble();

                    bank.createAccount(name, accNo, bal);
                    break;

                case 2:
                    System.out.print("Enter Account No: ");
                    int dAcc = sc.nextInt();

                    BankAccount dAccount = bank.searchAccount(dAcc);
                    if (dAccount == null) {
                        System.out.println("Account not found!");
                    } else {
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();
                        BankAccount.Transaction t = dAccount.new Transaction();
                        t.deposit(amt);
                    }
                    break;

                case 3:
                    System.out.print("Enter Account No: ");
                    int wAcc = sc.nextInt();

                    BankAccount wAccount = bank.searchAccount(wAcc);
                    if (wAccount == null) {
                        System.out.println("Account not found!");
                    } else {
                        System.out.print("Enter amount: ");
                        double amt = sc.nextDouble();
                        BankAccount.Transaction t = wAccount.new Transaction();
                        t.withdraw(amt);
                    }
                    break;

                case 4:
                    System.out.print("Enter Account No: ");
                    int cAcc = sc.nextInt();
                    bank.displayAccount(cAcc);
                    break;

                case 5:
                    bank.displayAll();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
