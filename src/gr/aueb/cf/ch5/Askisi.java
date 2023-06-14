package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Δημιουργήστε μία εφαρμογή που να εμφανίζει  ένα μενού με 6 επιλογές:
 * 1. Εμφάνισε n αστεράκια οριζόντια
 * 2. Εμφάνισε n αστεράκια κάθετα
 * 3. Εμφάνισε n γραμμές με n αστεράκια
 * 4. Εμφάνισε n γραμμές με αστεράκια 1 – n
 * 5. Εμφάνισε n γραμμές με αστεράκια n – 1
 * 6. Έξοδος από το πρόγραμμα
 * Δώσε επιλογή:
 * • Και μετά: Δώστε αριθμό για αστεράκια
 */

public class Askisi {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        switchCase();
    }

    public static void switchCase() {
        int choice= 0;
        int nStars;

        do {
            printMenu();
            choice = getNextInt("Επιλεξε ενα απο τα παραπανω");

            switch (choice) {
                case 1:
                    nStars = getNextInt("Δωσε αριθμο για αστεράκια");
                    horizontally(nStars,1);
                    break;
                case 2:
                    nStars = getNextInt("Δωσε αριθμο για αστεράκια");
                    vertically(nStars);
                    break;
                case 3:
                    nStars = getNextInt("Δωσε αριθμο για αστεράκια");
                    horizontally(nStars, nStars);
                    break;
                case 4:
                    nStars = getNextInt("Δωσε αριθμο για αστεράκια");
                    for (int i = 0; i < nStars; i++) {
                        horizontally(i,1);
                    }
                    break;
                case 5:
                    nStars = getNextInt("Δωσε αριθμο για αστεράκια");
                    for (int i = nStars; i >= 1; i--) {
                        horizontally(i,1);
                    }
                    break;
                case 6:
                    System.out.println("Επιλέξατε Έξοδο");
                    break;
                default:
                    System.out.println("Λανθασμενη επιλογη.Παρακαλω επιλεξτε ξανα\n");
            }
        } while (choice != 6);
    }

    public static void printMenu() {
        System.out.println("1.οριζόντια αστεράκια");
        System.out.println("2.κάθετα αστεράκια");
        System.out.println("3.αστεράκια x αστεράκια");
        System.out.println("4.1 έως X");
        System.out.println("5.X έως 1");
        System.out.println("6.Εξοδος");
    }

    public static int getNextInt(String n) {
        System.out.println(n);
        return in.nextInt();
    }

    public static void horizontally(int n,int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void vertically(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }
}
