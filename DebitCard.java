
package javaapplication1;


public class DebitCard implements PaymentStrategy
{

    @Override
    public void pay(double amount) {
        System.out.println("Refrigerator Amount Rs."+amount+" paid via DebitCard");
    }
    
    
}
