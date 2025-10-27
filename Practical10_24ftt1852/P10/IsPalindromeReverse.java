package P10;

import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 900) + 100; // random number between 100–999
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the reverse of " + number + ": ");
        int userReverse = input.nextInt();
        
        while (userReverse < 100 || userReverse > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
            userReverse = input.nextInt();
        }
        
        int reversed = reverse(number);
        boolean result = isPalindrome(userReverse, reversed);
        
        System.out.println("The digit " + userReverse + " is palindrome of " + number + " is " + result + ".");
    }
    
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
    
    public static boolean isPalindrome(int number, int reverse) {
        return number == reverse;
    }
}
