package P6;

import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an arithmetic expression (e.g. 3 + 4): ");
        int num1 = input.nextInt();
        String operator = input.next();
        int num2 = input.nextInt();

        switch (operator) {
            case "+":
                System.out.println("The sum is " + (num1 + num2));
                break;
            case "-":
                System.out.println("The subtraction is " + (num1 - num2));
                break;
            case "*":
                System.out.println("The multiplication is " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Math error: The divisor cannot be Zero");
                } else {
                    System.out.println("The division is " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }


    }
    

