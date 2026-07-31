
package javaapplication1;


public class Amazon {
    public static void main(String[] args) {
        PaymentStrategy payment;
        
        payment = new UPI();
        payment.pay(36000);
        payment = new CreditCard();
        payment.pay(250);
        payment = new DebitCard();
        payment.pay(52000);
        payment = new NetBanking();
        payment.pay(1600);
        
    }
}
