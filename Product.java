
package advancedjavaapplication;

public class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    // Static variables
    static String shopName = "Mano Fabrics Online Store";
    static final double gstPercent = 18.0;

    // Final variable
    final int DELIVERY_CHARGE = 50;

    // Constructor
    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculate subtotal
    double calculateSubtotal() {
        return price * quantity;
    }

    // Calculate GST
    double calculateGST() {
        return calculateSubtotal() * gstPercent / 100;
    }

    // Calculate final bill
    double calculateFinalBill() {
        return calculateSubtotal() + calculateGST() + DELIVERY_CHARGE;
    }

    // Display bill
    void displayBill() {
        System.out.println("\nShop Name: " + shopName);
        System.out.println("\nProduct ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Subtotal: " + calculateSubtotal());
        System.out.println("GST: " + calculateGST());
        System.out.println("Delivery Charge: " + DELIVERY_CHARGE);
        System.out.println("Final Bill: " + calculateFinalBill());
    }
}

