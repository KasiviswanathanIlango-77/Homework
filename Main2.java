
package advancedjavaapplication;

import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        // Create object
        Product product = new Product(id, name, price, quantity);

        // Display bill
        product.displayBill();

        sc.close();
    }

}
