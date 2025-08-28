package P5;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class QueueReceipt {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter name: ");
        String name =input.nextLine().toUpperCase();

        // Create folder Practical 5
        java.io.File folder = new java.io.File("Practical 5");
        folder.mkdir();

        // Format date/time 24-hour
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dateTime = sdf.format(new Date());

        // Generate queue number
        int queueNum = rand.nextInt(900) + 100; // random 3-digit number

        // Write to file
        FileWriter fw = new FileWriter("Practical 5/QReceipt.txt");
        fw.write("Date/Time: " + dateTime + "\r\n");
        fw.write("Welcome " + name + "\r\n");
        fw.write("Your Queue Number: " + queueNum + "\r\n");
        fw.close();

        System.out.println("Receipt generated. Thank you.");
    }
}
