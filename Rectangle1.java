import java.util.Scanner;

class Rectangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int length = sc.nextInt();

        System.out.print("Enter Breadth: ");
        int breadth = sc.nextInt();

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        sc.close();
    }
}
