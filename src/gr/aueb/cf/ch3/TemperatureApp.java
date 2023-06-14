package gr.aueb.cf.ch3;

import java.util.Scanner;

/** αποφασιζει αν χιονιζει με βαση
 * την θερμοκρασια.Αν η θερμ ειναι
 * < 0 τοτε χιονιζει αλλιως δεν χιονιζει
 * ο χρηστης δινει την θερμοκρασια
 */

public class TemperatureApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = sc.nextInt();

        isSnowing = (temp < 0);

        System.out.println("Is snowing: " + isSnowing);

    }
}
