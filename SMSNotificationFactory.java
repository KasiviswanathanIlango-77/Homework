/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaapplication;

/**
 *
 * @author HP
 */
public class SMSNotificationFactory extends NotificationFactory{

    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
    
}