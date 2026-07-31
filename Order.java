
package javaapplication1;
import java.util.*;

class Order implements OrderSubject {

    private List<OrderObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (OrderObserver observer : observers) {
            observer.update(message);
        }
    }

    // Change Order Status
    public void changeStatus(String status) {

        switch (status) {

            case "Ordered":
                notifyObservers(
                    "Your order has been placed successfully."
                );
                break;

            case "Packed":
                notifyObservers(
                    "Your order has been packed."
                );
                break;

            case "Shipped":
                notifyObservers(
                    "Your order has been shipped."
                );
                break;

            case "Delivered":
                notifyObservers(
                    "Your order has been delivered successfully."
                );
                break;

            default:
                System.out.println("Invalid order status.");
        }
    }
}
