package P7;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the term : ");
        int term = input.nextInt();

        if (term == 0) {
            System.out.println("At term 0 the number is 0");
        } else if (term == 1) {
            System.out.println("At term 1 the number is 1");
        } else {
            int f0 = 0, f1 = 1, fn = 0;
            for (int i = 2; i <= term; i++) { // loop starts from 2
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
            System.out.println("At term " + term + " the number is " + fn);
        }
    }
}
