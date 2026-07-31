
package javaapplication1;


public class NetBanking implements PaymentStrategy
{

    @Override
    public void pay(double amount) {
        System.out.println("TravelBag Amount Rs."+amount+" paid via NetBanking");
    }
    
}
