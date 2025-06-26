package SWAP;
public class swapUsingThirdVar {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("initial a: "+ a+" b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("final a: "+ a+" b: "+b);

    }

}
