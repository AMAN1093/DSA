package Capgemini;
import java.util.Scanner;

public class countSubarray {
    public static int findSubArrays(int num[]) {
        int count = 0;
        for (int i = 0; i <= num.length - 3; i++) {  // use <= not <
            int a = num[i];
            int b = num[i + 1];
            int c = num[i + 2];
            if (b % 2 == 0 && a + c == b / 2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        // Example 1: Using hardcoded array
        int num[] = {1, 2, 1, 4, 1};
        int result = findSubArrays(num);
        System.out.println("Number of special subarrays: " + result);

        // Example 2: Uncomment below to take input from user
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int num[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int result = findSubArrays(num);
        System.out.println("Number of special subarrays: " + result);
        sc.close();
        */
    }
}
