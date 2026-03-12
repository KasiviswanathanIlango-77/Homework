
import java.util.Scanner;

// Interface
interface Order {
    void placeOrder();
    void showBill();
}

// Parent class
class Customer {
    String customerName;

    // Constructor
    Customer(String name) {
        customerName = name;
    }
}

// Child class
class FoodOrder extends Customer implements Order {

    String foodItem;
    double price;

    // Constructor
    FoodOrder(String name, String item, double price) {
        super(name);
        this.foodItem = item;
        this.price = price;
    }

    // Implement placeOrder()
    public void placeOrder() {
        System.out.println("Order placed successfully!");
    }

    // Implement showBill()
    public void showBill() {
        System.out.println("\n--- Bill Details ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Food Item: " + foodItem);
        System.out.println("Price: " + price);
    }
}

// Main class
public class OnlineFoodOrderSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FoodOrder order = null;
        int choice;

        do {
            System.out.println("\n--- Online Food Order System ---");
            System.out.println("1. Place Order");
            System.out.println("2. View Bill");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Food Item: ");
                    String item = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    order = new FoodOrder(name, item, price);
                    order.placeOrder();
                    break;

                case 2:
                    if (order != null) {
                        order.showBill();
                    } else {
                        System.out.println("No order placed yet!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}

