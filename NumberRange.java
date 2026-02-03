import java.util.Scanner;

class NumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (num >= 10 && num <= 50) {
            System.out.println("Number is in range");
        } else {
            System.out.println("Number is out of range");
        }

        sc.close();
    }
}
