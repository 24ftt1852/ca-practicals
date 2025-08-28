package P5;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ModulusQuestion {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();

        int num1 = rand.nextInt(100);  // random number 0–99
        int num2 = rand.nextInt(99) + 1; // random number 1–99 (avoid division by zero)

        String question = num1 + " % " + num2 + " = ?";

       
        java.io.File folder = new java.io.File("Practical 5");
        folder.mkdir();

        FileWriter fw = new FileWriter("Practical 5/Modulus Questions.txt", true);
        fw.write(question + "\r\n");
        fw.close();

        System.out.println("A new question added");
    }
}