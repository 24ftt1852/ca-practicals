package P8;

import java.util.Scanner;
import java.util.Arrays;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }

        // check duplicates and set them to 0
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = 0;
                }
            }
        }

        // sort array
        Arrays.sort(nums);

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                System.out.print(nums[i] + " ");
        }
    }
}
