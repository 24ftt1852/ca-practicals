package P8;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create array from 0–9
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        // shuffle once
        Collections.shuffle(Arrays.asList(numbers));

        int chances = 10;
        boolean win = false;

        while (chances > 0) {
            System.out.print("Guess 4 numbers (no duplicates): ");
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = sc.nextInt();
            }

            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) {
                    score++;
                }
            }

            chances--;

            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                win = true;
                break;
            } else if (chances == 0) {
                System.out.print("The actual number is ");
                for (int i = 0; i < 4; i++) {
                    System.out.print(numbers[i] + " ");
                }
                System.out.println("You Lose.");
                break;
            } else {
                System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.");
            }
        }
    }
}
