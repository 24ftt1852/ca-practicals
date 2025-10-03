package P7;

import java.util.Scanner;

public class RockPaperScissorLoop {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        int rounds = 0;
        int userScore = 0;
        int computerScore = 0;

        String[] names = {"rock", "paper", "scissor"};
        String playAgain;

        do {
            int computer = (int) (Math.random() * 3);

            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            int user = input.nextInt();

            System.out.println("The computer is " + names[computer] + ". You are " + names[user] + ".");

            if (computer == user) {
                System.out.println("It is a draw.");
            } else if ((computer == 0 && user == 1) || (computer == 1 && user == 2) || (computer == 2 && user == 0)) {
                System.out.println("You win.");
                userScore++;
            } else {
                System.out.println("You lose.");
                computerScore++;
            }

            rounds++;

            System.out.print("Enter y to play again: ");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("In the total of " + rounds + " round(s), You scored " + userScore + ", Computer scored " + computerScore);

        if (userScore > computerScore) {
            System.out.println("You won the game!");
        } else if (userScore < computerScore) {
            System.out.println("You lost the game!");
        } else {
            System.out.println("It is a draw game.");
        }

        input.close();
    }
}