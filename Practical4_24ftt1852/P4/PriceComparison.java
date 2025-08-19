package P4;
import java.util.Scanner;

public class PriceComparison {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the first package: $");
        double price1 = input.nextDouble();

        System.out.print("Enter the weight of the 1st package in grams: ");
        int weight1 = input.nextInt();

        System.out.print("\nEnter the price of the 2nd package: $");
        double price2 = input.nextDouble(); 

        System.out.print("Enter the weight of the 2nd package in grams: ");
        int weight2 = input.nextInt();

        double pricePerGram1 = price1 / weight1;
        double pricePerGram2 = price2 / weight2;

        String result = (pricePerGram1 < pricePerGram2) ? "It is worth more to buy the 1st package" : "It is worth more to buy the 2nd package";

        System.out.println("\n" + result);


    }
    
}
