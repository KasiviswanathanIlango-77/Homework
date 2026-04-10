
package exceptionhandlingprograms;
public class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            // Throwing our custom exception if funds are low
            throw new InsufficientBalanceException("Error: Insufficient funds. Current balance: $" + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrew: $" + amount);
        System.out.println("Remaining balance: $" + balance);
    }
}