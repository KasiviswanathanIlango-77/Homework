import java.util.Scanner;

class AreaCalculator {

    // Area of Rectangle
    static double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    // Area of Circle
    static double circleArea(double radius) {
        return 3.14159 * radius * radius;
    }

    // Area of Square
    static double squareArea(double side) {
        return side * side;
    }

    // Area of Triangle
    static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- AREA CALCULATOR -----");
            System.out.println("1. Area of Rectangle");
            System.out.println("2. Area of Circle");
            System.out.println("3. Area of Square");
            System.out.println("4. Area of Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();
                    double rectArea = rectangleArea(l, b);
                    System.out.println("Area of Rectangle = " + rectArea);
                    break;

                case 2:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    double cirArea = circleArea(r);
                    System.out.println("Area of Circle = " + cirArea);
                    break;

                case 3:
                    System.out.print("Enter side: ");
                    double s = sc.nextDouble();
                    double sqArea = squareArea(s);
                    System.out.println("Area of Square = " + sqArea);
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    double triArea = triangleArea(base, height);
                    System.out.println("Area of Triangle = " + triArea);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
