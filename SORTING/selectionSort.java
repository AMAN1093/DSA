package SORTING;
import java.util.Scanner;
public class selectionSort {
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The  initial array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        selectionSort(arr);
        System.out.println("Sorted Array is : ");
        for(int value:arr){
            System.out.print(value+", ");
        }
    }
    
    
}
