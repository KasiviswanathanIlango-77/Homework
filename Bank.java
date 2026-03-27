
package advancedjavaapplication;


public class Bank {
    NodeClass head = null;

    // Create account (insert at end)
    void createAccount(String name, int accNo, double balance) {
        BankAccount acc = new BankAccount(name, accNo, balance);
        NodeClass newNode = new NodeClass(acc);

        if (head == null) {
            head = newNode;
        } else {
            NodeClass temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Account created!");
}
    // Search account
    BankAccount searchAccount(int accNo) {
        NodeClass temp = head;
        while (temp != null) {
            if (temp.data.accountNumber == accNo) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    // Display single account
    void displayAccount(int accNo) {
        BankAccount acc = searchAccount(accNo);
        if (acc == null) {
            System.out.println("Account not found!");
        } else {
            System.out.println("Name: " + acc.name);
            System.out.println("Account No: " + acc.accountNumber);
            System.out.println("Balance: " + acc.balance);
        }
    }

    // Display all accounts
    void displayAll() {
        if (head == null) {
            System.out.println("No accounts available.");
            return;
        }

        NodeClass temp = head;
        while (temp != null) {
            System.out.println("---------------------");
            System.out.println("Name: " + temp.data.name);
            System.out.println("Account No: " + temp.data.accountNumber);
            System.out.println("Balance: " + temp.data.balance);
            temp = temp.next;
        }
    }
}
