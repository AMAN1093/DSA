package Practice;
import java.util.Scanner;

public class swap {

    // Change return type to void (or return an array if needed)
    public static void swapping(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping inside method:");
        System.out.println("The value of x: " + x + " and the value of y: " + y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();

        System.out.println("Before swapping:");
        System.out.println("The value of x: " + x + " and the value of y: " + y);

        // Just call the method — no need to store the return since it’s void
        swapping(x, y);

        System.out.println("After calling swapping method in main:");
        System.out.println("The value of x: " + x + " and the value of y: " + y);

        sc.close();
    }
}

