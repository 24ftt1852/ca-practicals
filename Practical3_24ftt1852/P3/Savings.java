package P3;

import java.util.Scanner;

public class p3_5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("What is your target amount? $");
        int targetAmount = input.nextInt();

        System.out.print("How many month(s) to reach your goal? ");
        int months = input.nextInt();

        int totalDays = months * 30; // Assuming 30 days in a month
        double dailySavings = (double) targetAmount / totalDays;

        System.out.printf("The amount you need to save per day is $%.2f\n", dailySavings);


    }
    
}
