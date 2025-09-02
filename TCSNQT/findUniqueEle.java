// find the unique element in the array and this XOR  operation only applicable forvfinding  the one unique element.
package TCSNQT;
import java.util.Scanner;
public class findUniqueEle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
       
        int unique = 0;
        for (int num : arr) {
            unique ^= num; // XOR operation
        }
       System.out.println("The unique element in the array is :");
        System.out.println(unique);
    
    }
}
