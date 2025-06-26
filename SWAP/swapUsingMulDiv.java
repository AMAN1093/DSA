package SWAP;

public class swapUsingMulDiv {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("initial a: "+ a+" b: "+b);
        a = a * b; 
        b = a / b; 
        a = a / b; 
        System.out.println("final a: "+ a+" b: "+b);

    }

}
