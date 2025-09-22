package Capgemini;
import java.util.Scanner;
public class isPalindrome {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str= sc.next();
        System.out.println("the entered string is :"+ str);
        int n= str.length();
        str = str.toLowerCase();
        boolean isPalindrome = true;
        for(int i= 0; i< n/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("the string  is the palindrome.");
        }else{
            System.out.println("the string is not the palindrome");
        }
    }
    
}
