package P3;
import java.util.Scanner;

public class CharacterToUnicode {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char choice = input.next().charAt(0);

        int chValue = choice;

        System.out.println("The Unicode for a character " + choice + " is " + chValue    );





        
    }
    
}
