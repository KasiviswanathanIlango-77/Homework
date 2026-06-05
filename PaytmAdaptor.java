
package advancedjavaapplication;


public class PaytmAdaptor implements PaymentGateway {

    private Paytm paytm;

    public PaytmAdaptor(Paytm paytm) {
        this.paytm = paytm;
    }

    public void pay(int amount) {
        paytm.transfer(amount);
    }
}
