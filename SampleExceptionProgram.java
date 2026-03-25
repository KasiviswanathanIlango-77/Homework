
package advancedjavaapplication;

import java.util.Scanner;


public class SampleExceptionProgram {
    // 🔹 Arithmetic Exception Module
    public static void arithmeticDemo(Scanner sc) {
        try {
            System.out.print("Enter numerator: ");
            int num = sc.nextInt();

            System.out.print("Enter denominator: ");
            int den = sc.nextInt();

            int result = num / den;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }

    // 🔹 Null Pointer Exception Module
    public static void nullPointerDemo(Scanner sc) {
        try {
            System.out.print("Enter a string (type 'null' to simulate null): ");
            sc.nextLine(); // clear buffer
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("null")) {
                str = null;
            }

            int length = str.length(); // may throw NullPointerException
            System.out.println("Length of string: " + length);

        } catch (NullPointerException e) {
            System.out.println("Error: String is null, cannot find length!");
        }
    }

    // 🔹 Array Index Out Of Bounds Module
    public static void arrayIndexDemo(Scanner sc) {
        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index (0 - " + (arr.length - 1) + "): ");
            int index = sc.nextInt();

            System.out.println("Element at index " + index + ": " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter a valid index.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display Menu
            System.out.println("\n===== Exception Handling Menu =====");
            System.out.println("1. Arithmetic Exception Demo");
            System.out.println("2. Null Pointer Exception Demo");
            System.out.println("3. Array Index Out Of Bounds Demo");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    arithmeticDemo(sc);
                    break;

                case 2:
                    nullPointerDemo(sc);
                    break;

                case 3:
                    arrayIndexDemo(sc);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
