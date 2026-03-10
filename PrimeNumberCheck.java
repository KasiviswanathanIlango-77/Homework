import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int number, i;
        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if (number <= 1) {
            isPrime = false;
        } else {
            for (i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(number + " is a Prime Number");
        else
            System.out.println(number + " is not a Prime Number");

        sc.close();
    }
}