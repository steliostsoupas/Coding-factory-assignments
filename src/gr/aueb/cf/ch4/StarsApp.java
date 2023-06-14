package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 *  Αναπτύξτε πέντε προγράμματα αντίστοιχα με τα
 * προηγούμενα όπου ο χρήστης θα δίνει το πλήθος
 * των stars, έστω n
 * – n οριζόντια αστεράκια,
 * – n κάθετα,
 * – nxn,
 * – από 1 έως n,
 * – από n έως 1
 */

public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menuChoice;
        int stars;
        int starsx1;
        int starsx2;

        do {
            System.out.println("\nΠαρακαλώ επιλεξτε ενα απο τα παρακατω:" +
                    "\n1.οριζόντια αστεράκια" +
                    "\n2.κάθετα αστεράκια" +
                    "\n3.αστεράκια x αστεράκια" +
                    "\n4.1 έως X" +
                    "\n5.X έως 1" +
                    "\n6.Εξοδος");

            menuChoice = in.nextInt();

            switch (menuChoice) {
                case 1:
                    System.out.println("Ποσα αστερακια θελεις να εκτωπωσω : ");
                    stars = in.nextInt();
                    for (int i = 0; i < stars; i++)
                        System.out.print("*");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Ποσα αστερακια θελεις να εκτωπωσω : ");
                    stars = in.nextInt();
                    for (int i = 0; i < stars; i++)
                        System.out.println("*");
                    break;
                case 3:
                    System.out.println("Ποσα επι ποσα αστερακια  θελεις να εκτωπωσω : ");
                    starsx1 = in.nextInt();
                    starsx2 = in.nextInt();

                    for (int i = 0; i < starsx1; i++) {

                        for (int j = 0; j < starsx2; j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Επιλέξατε 1 έως X.Δωσε μου τον Χ\n");
                    stars = in.nextInt();
                    for (int i = 1; i <= stars; i++) {

                        for (int j = 1; j <= i; j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Επιλέξατε X έως 1.Δωσε μου τον Χ\n");
                    stars = in.nextInt();
                    for (int i = 1; i <= stars; i++) {

                        for (int j = i ; j <= stars; j++)
                            System.out.print("*");
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Επιλέξατε Έξοδο");
                    break;
                default:
                    System.out.println("Λανθασμενη επιλογη.Παρακαλω επιλεξτε ξανα\n");
            }
        } while (menuChoice != 6);
    }
}
