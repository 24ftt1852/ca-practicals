package P9;

import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'C'},
            {'C', 'B', 'A', 'B', 'B', 'A'},
            {'A', 'B', 'C', 'B', 'A', 'C'}
        };

        System.out.print("Enter the key to the MCQ: ");
        char[] keys = new char[6];
        for (int i = 0; i < keys.length; i++) {
            keys[i] = input.next().charAt(0);
        }

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }

            String result = (correctCount >= 3) ? "passed" : "failed";
            System.out.printf("Student %d's correct count is %d. Therefore, he/she %s the test.\n",
                    i, correctCount, result);
        }
    }
}

