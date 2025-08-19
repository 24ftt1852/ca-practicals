package P4;

import java.util.Scanner;

public class MathQuiz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Generate two random whole numbers between 0 and 100
        int num1 = (int) (Math.random() * 101);
        int num2 = (int) (Math.random() * 101);

        // Ask user for the sum
        System.out.print("What is " + num1 + " + " + num2 + " ?\n");
        int userSum = input.nextInt();

        // Print result for sum
        System.out.println(num1 + " + " + num2 + " = " + userSum + " is " + (userSum == (num1 + num2)));

        // Ask user for the modulus
        System.out.print("What is " + num1 + " % " + num2 + " ?\n");
        int userMod = input.nextInt();

        // Print result for modulus
        System.out.println(num1 + " % " + num2 + " = " + userMod + " is " + (userMod == (num1 % num2)));
    }
}