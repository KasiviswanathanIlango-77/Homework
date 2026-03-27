
package advancedjavaapplication;
// BankAccount class
public class BankAccount {
    String name;
    int accountNumber;
    double balance;

    // Constructor
    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Inner class for transactions
    class Transaction {
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient balance!");
            } else {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            }
        }
    }
}