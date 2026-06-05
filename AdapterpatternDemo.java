
package advancedjavaapplication;


public class AdapterpatternDemo {
    public static void main(String[] args) {

        PaymentGateway gpay = new GooglePayAdapter(new GooglePay());
        PaymentGateway phonepe = new PhonePeAdaptor(new PhonePe());
        PaymentGateway paytm = new PaytmAdaptor(new Paytm());

        gpay.pay(100);
        phonepe.pay(200);
        paytm.pay(300);
    }
}
