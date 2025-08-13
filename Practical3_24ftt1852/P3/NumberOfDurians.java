package P3;

import java.util.Scanner;

public class p3_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double durianPrice = 15.75;

        System.out.println("Each durian costs $15.75");

        System.out.print("Enter how much money do you have? $");
        double money = input.nextDouble();

        int durianCount = (int) (money / durianPrice);

        System.out.println("The number of durian(s) you can buy is " +  durianCount);
        
    }
    
}
