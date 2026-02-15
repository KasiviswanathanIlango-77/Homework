import java.util.Scanner;

public class MenuDrivenArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = 0;
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Insert elements");
            System.out.println("2. Display elements");
            System.out.println("3. Count Even numbers");
            System.out.println("4. Count Odd numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number of elements: ");
                    n = sc.nextInt();
                    System.out.println("Enter " + n + " elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Array is empty!");
                    } else {
                        System.out.println("Array elements are:");
                        for (int i = 0; i < n; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int evenCount = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0) {
                            evenCount++;
                        }
                    }
                    System.out.println("Total Even numbers = " + evenCount);
                    break;

                case 4:
                    int oddCount = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 != 0) {
                            oddCount++;
                        }
                    }
                    System.out.println("Total Odd numbers = " + oddCount);
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
