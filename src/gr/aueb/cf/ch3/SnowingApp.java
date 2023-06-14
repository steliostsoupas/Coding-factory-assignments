package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Αποφασιζει αν χιονιζει ή οχι με
 * βαση οχι μονο τη θερμοκρασια
 * αλλα και το αν βρεχει.Αν βρεχει και η
 * θερμοκρασια ειναι
 * < 0 τοτε χιονιζει αλλιως οχι.
 */

public class SnowingApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert temperature (int): ");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
