package Capgemini;
public class BirdPuzzle {
    public static void main(String[] args) {
        for (int s = 0; s <= 100; s++) {         // sparrows
            for (int c = 0; c <= 100; c++) {     // crows
                for (int p = 0; p <= 100; p++) { // parrots
                    if (s + c + p == 100) { // total birds
                        double cost = (s / 20.0) + c + (5 * p); // total cost
                        if (cost == 100) {
                            System.out.println("Sparrows: " + s +
                                               ", Crows: " + c +
                                               ", Parrots: " + p);
                        }
                    }
                }
            }
        }
    }
}

