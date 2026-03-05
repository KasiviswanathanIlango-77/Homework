import java.util.Scanner;

class Dsa2 {

    static int[] arr;      // Global array
    static int n;          // Global size
    static boolean isSorted = false;

    // Linear Search
    static int linearSearch(int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // Bubble Sort
    static void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort
    static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    static void merge(int left, int mid, int right) {
        int[] temp = new int[n];

        int i = left, j = mid + 1, k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        for (i = left; i <= right; i++)
            arr[i] = temp[i];
    }

    // Binary Search
    static int binarySearch(int key) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array length: ");
        n = sc.nextInt();
        arr = new int[n];

        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Accept array elements");
            System.out.println("2. Display array");
            System.out.println("3. Sort array");
            System.out.println("4. Search element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter " + n + " elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    isSorted = false;
                    System.out.println("Array stored successfully.");
                    break;

                case 2:
                    System.out.println("Array elements are:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("Array is empty.");
                        break;
                    }

                    System.out.println("\nChoose sorting method:");
                    System.out.println("1. Bubble Sort");
                    System.out.println("2. Merge Sort");
                    System.out.print("Enter your choice: ");
                    int sortChoice = sc.nextInt();

                    switch (sortChoice) {
                        case 1:
                            bubbleSort();
                            System.out.println("Array sorted using Bubble Sort.");
                            isSorted = true;
                            break;

                        case 2:
                            mergeSort(0, n - 1);
                            System.out.println("Array sorted using Merge Sort.");
                            isSorted = true;
                            break;

                        default:
                            System.out.println("Invalid sorting choice.");
                    }
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();

                    System.out.println("\nChoose searching method:");
                    System.out.println("1. Linear Search");
                    System.out.println("2. Binary Search");
                    System.out.print("Enter your choice: ");
                    int searchChoice = sc.nextInt();

                    int result = -1;

                    switch (searchChoice) {
                        case 1:
                            result = linearSearch(key);
                            break;

                        case 2:
                            if (!isSorted) {
                                System.out.println("Array must be sorted before Binary Search.");
                                break;
                            }
                            result = binarySearch(key);
                            break;

                        default:
                            System.out.println("Invalid search choice.");
                            continue;
                    }

                    if (searchChoice == 1 || (searchChoice == 2 && isSorted)) {
                        if (result != -1)
                            System.out.println("Element found at position " + (result + 1));
                        else
                            System.out.println("Element not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}