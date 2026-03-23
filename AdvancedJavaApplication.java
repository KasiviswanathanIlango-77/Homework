package advancedjavaapplication;

import java.util.Scanner;

public class AdvancedJavaApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String originalOTP = "4589";   // predefined OTP

        System.out.print("Enter OTP: ");
        String userOTP = sc.nextLine();

        // Verification
        if (originalOTP.equals(userOTP)) {
            System.out.println("OTP Verified Successfully");
        } else {
            System.out.println("Invalid OTP");
        }

        // Trying to modify OTP using concat()
        originalOTP.concat("123");

        // Display OTP after concat
        System.out.println("After concat: " + originalOTP);
    }

}
