package SORTING;

import java.util.Scanner;
public class bubbleSort {
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        Boolean swapped;
        for (int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        bubbleSort(arr);
        

        for(int value:arr){
            System.out.print(value+", ");
        }

    }
    
    
}
