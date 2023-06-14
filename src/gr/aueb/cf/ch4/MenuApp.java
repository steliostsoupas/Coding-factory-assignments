package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εμφανίστε επαναληπτικά ένα μενού με τις παρακάτω
 * επιλογές, το οποίο να επαναλαμβάνεται μέχρι ο χρήστης να
 * δώσει τον αριθμό 5. Για κάθε επιλογή από 1 – 4 θα πρέπει
 * να εμφανίζεται feedback, για παράδειγμα αν ο χρήστης
 * δώσει 1, θα εμφανίζεται το μήνυμα “Επιλέξατε Εισαγωγή».
 * Θα πρέπει επίσης να ελέγχετε αν ο χρήστης δώσει αριθμό
 * < 0 ή > 5 και να δίνετε κατάλληλο μήνυμα.
 * 1. Εισαγωγή
 * 2. Διαγραφή
 * 3. Ενημέρωση
 * 4. Αναζήτηση
 * 5. Έξοδος */

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Παρακαλώ επιλεξτε ενα απο τα παρακατω:" +
                    "\n1.Εισαγωγή" +
                    "\n2.Διαγραφή" +
                    "\n3.Ενημέρωση" +
                    "\n4.Αναζήτηση" +
                    "\n5.Έξοδος");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Επιλέξατε Εισαγωγή\n");
                    break;
                case 2:
                    System.out.println("Επιλέξατε Διαγραφή\n");
                    break;
                case 3:
                    System.out.println("Επιλέξατε Ενημέρωση\n");
                    break;
                case 4:
                    System.out.println("Επιλέξατε Αναζήτηση\n");
                    break;
                case 5:
                    System.out.println("Επιλέξατε Έξοδος\n");
                    break;
                default:
                    System.out.println("Λανθασμενη επιλογη.Παρακαλω επιλεξτε ξανα\n");
            }
        } while (choice != 5);
    }
}
