import java.util.Scanner;

class Calculator {

    // Addition
    int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    int sub(int a, int b) {
        return Math.abs(a - b);
    }

    // Multiplication (long return type)
    long multiply(int a, int b) {
        return (long) a * b;
    }

    // Division with error handling
    void div(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 → Addition");
            System.out.println("2 → Subtraction");
            System.out.println("3 → Multiplication");
            System.out.println("4 → Division");
            System.out.println("5 → Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter First Number: ");
                int a = sc.nextInt();
                System.out.print("Enter Second Number: ");
                int b = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Addition: " + cal.add(a, b));
                        break;

                    case 2:
                        System.out.println("Subtraction: " + cal.sub(a, b));
                        break;

                    case 3:
                        System.out.println("Multiplication: " + cal.multiply(a, b));
                        break;

                    case 4:
                        cal.div(a, b);
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
