import java.util.Scanner;
import java.util.Arrays;


public class binarySearch {
    public static int binarySearch(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("We are going to perform the Binary Search Operation:");
        System.out.println("Enter the size of tha array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        System.out.println("the elements of the array are :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        // set the target to find that element in the array
        System.out.println("Enter the target:");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("the element is   found in the array: " + result);
        } else {
            System.out.println("the element is  not found in the array :");
        }

    }

}
