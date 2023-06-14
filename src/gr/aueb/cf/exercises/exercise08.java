package gr.aueb.cf.exercises;

import java.util.Scanner;

public class exercise08 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        printMenu();
        choice = getChoice();

            try {
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Δωσε μου αριθμο απο το 1 εως το 5");
        }
    }

    public static void printChoice(int choice) throws IllegalArgumentException {
        try {
            if (choice > 5 || choice < 0) throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static int getChoice() {
        int choice = -1;

        if (sc.hasNextInt()) {
            choice = sc.nextInt();
            System.out.println("Επιλεξες " + choice);
        } else {
            System.out.println("Δωσε μου εναν ακεραιο");
            return -1;
        }

        return choice;
    }

    public static void printMenu() {
            System.out.println("Επιλεξτε ενα απο τα παρακατω");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. Exit ");
    }
}
