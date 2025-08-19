package P4;
import java.util.Scanner;

public class ReverseOfInteger {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.print("Enter an interger between 100 and 999: ");
        int number = input.nextInt();

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        String reversedNumber = ones + "" + tens + "" + hundreds;

        System.out.println("The reverse of " + number + " is " + reversedNumber);


    }

    
}
