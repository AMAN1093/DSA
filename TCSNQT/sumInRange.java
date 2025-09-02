//Given a range [m, n] (both inclusive) where 0 <= m, n <= 10000, find the sum of all integers between m and n.

package TCSNQT;
import java.util.Scanner;

public class sumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting Integer.");
        int m= sc.nextInt();
        System.out.println("Enter the Ending Integer.");
        int n = sc.nextInt();
        System.out.println("The sum of the Intergers from starting to the ending.");
        int sum =0;
        //The for loop is running from m to n.
        for (int i = m; i <= n; i++) {
            sum += i;
        }
         System.out.println(sum);


    }
    
}
