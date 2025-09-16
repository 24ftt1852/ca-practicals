package P6;

import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        int computer = (int)(Math.random() * 3);

        System.out.print("Enter rock (0), paper (1), scissor (2): ");
        int user = input.nextInt();

        
        String[] names = {"rock", "paper", "scissor"};
        System.out.println("The computer is " + names[computer] + ". You are " + names[user] + ".");

        
        if (computer == user)
            System.out.println("It is a draw.");
        if (computer == 0 && user == 1)
            System.out.println("You win.");
        if (computer == 0 && user == 2)
            System.out.println("You lose.");
        if (computer == 1 && user == 0)
            System.out.println("You lose.");
        if (computer == 1 && user == 2)
            System.out.println("You win.");
        if (computer == 2 && user == 0)
            System.out.println("You win.");
        if (computer == 2 && user == 1)
            System.out.println("You lose.");
    }
}
    

