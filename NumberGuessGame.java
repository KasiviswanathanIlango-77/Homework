
package simplejavaprograms;

import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        int number = 42;
        Scanner sc = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 100:");
        int guesno = sc.nextInt();
        byte count = 1;

        do {
            if (guesno < number) {
                System.out.println("Too Low");
                count++;
                guesno = sc.nextInt();
            } 
            else if (guesno > number) {
                System.out.println("Too High");
                count++;
                guesno = sc.nextInt();
            } 
            else {
                System.out.println("Correct! You won in " + count + " attempts");
            }

        } while (guesno != number);
    }
}


   
