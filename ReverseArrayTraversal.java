// Reverse Array Traversal
// Question:
// Write a program to traverse an array in reverse order.

// Sample Input:

// 1 2 3 4
// Sample Output:

// 4 3 2 1 

import java.util.Scanner;

public class ReverseArrayTraversal {

    // Recursive method to print array in reverse
     void printReverse(int[] arr, int index) {
        // Base case
        if (index < 0) {
            return;
        }

        // Print current element
        System.out.print(arr[index] + " ");

        // Recursive call
        printReverse(arr, index - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseArrayTraversal rat=new ReverseArrayTraversal();
        // Read size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Read elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call recursive function starting from last index
        rat.printReverse(arr, n - 1);

        sc.close();
    }
}