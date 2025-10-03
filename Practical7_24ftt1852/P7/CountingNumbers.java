package P7;
import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, positives = 0, negatives = 0, total = 0, count = 0;

        System.out.println("Enter an integer, the input ends if it is 0:");
        while (true) { 
            number = input.nextInt();
            if (number == 0) break;  

            if (number > 0) positives++;
            else negatives++;

            total += number;
            count++;
        }

        if (count == 0) {
            System.out.println("No number is entered except for 0 to end the program.");
        } else {
            double average = (double) total / count;
            System.out.println("The number of positive is " + positives);
            System.out.println("The number of negatives is " + negatives);
            System.out.println("The total is " + total);
            System.out.printf("The average is %.2f%n", average);
        }
    }
}
