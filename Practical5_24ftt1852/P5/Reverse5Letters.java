package P5;
import java.util.Scanner;

public class Reverse5Letters {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the 5 letters word: ");
        String word = input.nextLine();

        if (word.length() == 5){
            String reversed = "" 

            + word.charAt(4)
            + word.charAt(3)
            + word.charAt(2)
            + word.charAt(1)
            + word.charAt(0);

            System.out.println("The reversed of the word " + word + " is " + reversed );

        }
}
}