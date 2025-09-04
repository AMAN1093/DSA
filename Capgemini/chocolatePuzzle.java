package Capgemini;

public class chocolatePuzzle {
    public static void main(String[] args) {
        int money = 15;          // rupees
        int price = 1;           // 1 chocolate = 1 rupee
        int chocolates = money / price; // initial chocolates
        int wrappers = chocolates;      // wrappers from first chocolates

        // keep exchanging wrappers for chocolates
        while (wrappers >= 3) {
            int newChocolates = wrappers / 3;   // how many chocolates from wrappers
            chocolates += newChocolates;        // add to total
            wrappers = (wrappers % 3) + newChocolates; // leftover + new wrappers
        }

        System.out.println("Total chocolates: " + chocolates);
    }
}
