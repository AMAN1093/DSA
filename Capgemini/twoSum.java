package Capgemini;
import java.util.Scanner;
public class twoSum {
    public static  int[] arraySum(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("The elements of the array is :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+", ");
        }
        int target = sc.nextInt();

        arraySum(arr, target);

    }
    
}
