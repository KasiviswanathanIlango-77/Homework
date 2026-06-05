/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaapplication;

/**
 *
 * @author HP
 */
public class GooglePayAdapter implements PaymentGateway {

    private GooglePay googlePay;

    public GooglePayAdapter(GooglePay googlePay) {
        this.googlePay = googlePay;
    }

    public void pay(int amount) {
        googlePay.makePayment(amount);
    }
}
