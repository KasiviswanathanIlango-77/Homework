
package com.mycompany.emailsenderapp;

import java.util.Properties;
import java.util.Scanner;
import jakarta.mail.*;
import jakarta.mail.internet.*;
public class EmailSenderApp {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Sent To:");
        String toEmail=sc.nextLine();
        System.out.print("Subject:");
        String subject=sc.nextLine();
        System.out.print("Message:");
        String messageText=sc.nextLine();
        final String email="saikasi97348@gmail.com";
        final String password="676897";
        // SMTP properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Create session
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, password);
            }
        });

        try {
            // Create message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(toEmail)
            );
            message.setSubject(subject);
            message.setText(messageText);

            // Send message
            Transport.send(message);

            System.out.println("Mail sent successfully!");

        } catch (MessagingException e) {
            System.out.println("Error: Mail not sent.");
            e.printStackTrace();
        }

        sc.close();
    }
}
