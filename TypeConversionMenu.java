import java.util.Scanner;

class TypeConversionMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== TYPE CONVERSION MENU ===");
            System.out.println("1. int to double");
            System.out.println("2. double to int");
            System.out.println("3. char to int");
            System.out.println("4. int to char");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter an integer: ");
                    int intVal = sc.nextInt();
                    double doubleVal = intVal;   // implicit casting
                    System.out.println("Converted to double: " + doubleVal);
                    break;

                case 2:
                    System.out.print("Enter a double value: ");
                    double dVal = sc.nextDouble();
                    int iVal = (int) dVal;   // explicit casting
                    System.out.println("Converted to int: " + iVal);
                    break;

                case 3:
                    System.out.print("Enter a character: ");
                    char ch = sc.next().charAt(0);
                    int charToInt = ch;   // implicit casting (ASCII/Unicode value)
                    System.out.println("Converted to int (ASCII value): " + charToInt);
                    break;

                case 4:
                    System.out.print("Enter an integer: ");
                    int num = sc.nextInt();
                    char intToChar = (char) num;   // explicit casting
                    System.out.println("Converted to char: " + intToChar);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}