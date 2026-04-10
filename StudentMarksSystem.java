
package exceptionhandlingprograms;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarksSystem {

    static ArrayList<Integer> marksList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Enter Student Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    try {
                        enterMarks(sc);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    displayMarks();
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void enterMarks(Scanner sc) {
        System.out.print("Enter marks (0 - 100): ");
        int marks = sc.nextInt();

        // Validation
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }

        marksList.add(marks);
        System.out.println("Marks added successfully!");
    }

    public static void displayMarks() {
        if (marksList.isEmpty()) {
            System.out.println("No marks available.");
        } else {
            System.out.println("Student Marks:");
            for (int m : marksList) {
                System.out.println(m);
            }
        }
    }
}