package SEARCHING;
import java.util.Scanner;
public class linearSearch {
    public static int LINEARSEARCH(int arr[], int target,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the Array elements");
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println("the elements of the array are :");
        for(int i=0;i<n;i++) System.out.print(arr[i]+", ");
        System.out.println();
        System.out.println("enter the target:");
        int target= sc.nextInt();
        // System.out.println("searching in the array wait :");
        int result=LINEARSEARCH(arr, target, n);
        if(result !=-1){
            System.out.println("the element is   found in the array: "+ result);
        }else{
            System.out.println("the element is  not found in the array :");
        }

        

    }
}
