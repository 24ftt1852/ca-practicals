package P7;

public class LoopsLoopsLoops {

    public static void main(String[] args) {
    
        System.out.println("Below is generated using while loop:");
        int counter = 1;
        while (counter <= 20) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();

    
        System.out.println("Below is generated using dowhile loop:");
        counter = 50;
        do {
            System.out.print(counter + " ");
            counter--;
        } while (counter >= 35);
        System.out.println();

        
        System.out.println("Below is generated using for loop:");
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }
}