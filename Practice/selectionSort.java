package Practice;
import java.util.Scanner;

import SEARCHING.linearSearch;

public class selectionSort {
    public static int[] selectionSort(int arr[]){
        int n= arr.length;
        
        for(int i=0;i<n;i++){
            int smallestIndex=i;
            for(int j = i+1; j<n;j++){
                while (arr[j]< arr[smallestIndex]){
                    smallestIndex =j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[smallestIndex];
            arr[smallestIndex]= temp;

        }
        return arr;
    }
    public static boolean LinearSearch(int arr[], int key){
        int n=arr.length;
        boolean result = false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                result = true;
            }
        }
        return result;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n= sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the elements of the array :");

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println();
        System.out.println("the elements of the array are :");
        for( int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        int result[] = selectionSort(arr);
        System.out.println("the sorted array is :");
        for (int num : result){
            System.out.print(num+" ,");
        }

        System.out.println("enter the key that you want to to check whether it is found in the array or not:");
        int key = sc.nextInt();

        boolean keyFound = LinearSearch(arr, key);
        if(keyFound == true){
            System.out.println("the key is found in the array :");
        }else{
            System.out.println("the key is not found in the array :");
        }
    }

    
}
