
package javaapplication1;


public class OnlineShoppingOrderTracking {
     public static void main(String[] args) {

        // Create Order
        Order order = new Order();

        // Create Customer
        Customer customer = new Customer("Kasiviswanathan");

        // Register Customer as Observer
        order.addObserver(customer);

        // Change Order Status
        order.changeStatus("Ordered");
        order.changeStatus("Packed");
        order.changeStatus("Shipped");
        order.changeStatus("Delivered");
    }

}
