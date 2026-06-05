/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaapplication;

/**
 *
 * @author HP
 */
public class PhonePeAdaptor implements PaymentGateway {

    private PhonePe phonePe;

    public PhonePeAdaptor(PhonePe phonePe) {
        this.phonePe = phonePe;
    }

    public void pay(int amount) {
        phonePe.sendMoney(amount);
    }
}
