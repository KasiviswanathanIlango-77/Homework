
package javaapplication1;


public class CreditCard implements PaymentStrategy
{

    @Override
    public void pay(double amount) {
        System.out.println("Book Amount Rs."+amount+" paid via CreditCard");
    }
    
}
