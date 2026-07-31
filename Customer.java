
package javaapplication1;


public class Customer implements OrderObserver
{
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(String message) {
        System.out.println(customerName + " receives notification: " + message);
    }
}
