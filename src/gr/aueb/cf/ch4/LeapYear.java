package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Θέλουμε να αναπτύξουμε ένα
 * πρόγραμμα που να αποφαίνεται αν
 * ένα έτος είναι δίσεκτο ή όχι
 * • Δηλαδή να προτρέπει τον χρήστη να
 * δώσει ένα έτος από το πληκτρολόγιο,
 * να διαβάζει με Scanner το έτος
 * (ακέραιος), να κάνει την επεξεργασία
 * και να εμφανίζει στην οθόνη αν το έτος
 * αυτό είναι δίσεκτο ή όχι.
 */

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
