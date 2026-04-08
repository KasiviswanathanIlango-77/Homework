
package advancedjavaapplication;

// UserIdValidator.java
import java.util.Scanner;

public class UserIdValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter User ID: ");
            String input = scanner.nextLine();

            try {
                int userId = validateUserId(input);
                System.out.println("Valid User ID: " + userId);
                break; // Exit loop on valid input
            } catch (NumberFormatException e) {
                System.out.println("User ID must be a number");
            } catch (Invaliduseridexcep e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }

    public static int validateUserId(String input) throws NumberFormatException, Invaliduseridexcep {
        int userId = Integer.parseInt(input); // May throw NumberFormatException
        if (userId <= 0) {
            throw new Invaliduseridexcep("User ID must be positive");
        }
        return userId;
    }
}

