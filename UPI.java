
package javaapplication1;


public class UPI implements PaymentStrategy
{

    @Override
    public void pay(double amount) {
        System.out.println("TV Amount Rs."+amount+" paid via UPI");
    }
    
}
