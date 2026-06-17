
package advancedjavaapplication;
import java.util.Scanner;
import java.util.ArrayList;
public class Bakery {
    public static void main(String[] args) {
        
   
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input:");
        String input = sc.nextLine(); // Example: [1.2, 0.5, 2.3, 1.8]

        input = input.replace("[", "").replace("]", "");

        String[] values = input.split(",");

        ArrayList<Double> weights = new ArrayList<>();

        double totalWeight = 0;
        double heaviestIngredient = Double.MIN_VALUE;

        for (String value : values) {
            double weight = Double.parseDouble(value.trim());
            weights.add(weight);

            totalWeight += weight;

            if (weight > heaviestIngredient) {
                heaviestIngredient = weight;
            }
        }

        System.out.println("(" + totalWeight + ", " + heaviestIngredient + ")");
         }
}
