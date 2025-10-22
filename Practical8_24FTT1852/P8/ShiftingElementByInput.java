package P8;

import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers are there? ");
        int n = input.nextInt();

        int[] num = new int[n];
        System.out.println("Enter the " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }

        System.out.print("Enter number of left shift: ");
        int shift = input.nextInt();

        // shift elements to the left
        for (int s = 0; s < shift; s++) {
            int first = num[0];
            for (int i = 0; i < n - 1; i++) {
                num[i] = num[i + 1];
            }
            num[n - 1] = first;
        }

        System.out.println("\nThe shifted arrangement is: ");
        for (int x : num) {
            System.out.print(x + " ");
        }
    }
}
