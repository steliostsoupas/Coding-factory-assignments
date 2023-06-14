package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρηστης δινει ενα διψηφιο ακεραιο
 * και βρισκουμε το αθροισμα των δυο ψηφιων.
 */

public class IntTwoDigitsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sumOfDigits = 0;

        System.out.println("Παρακαλω δωσε μου εναν διψηφιο ακεραιο αριθμο: ");
        num = in.nextInt();

        leftDigit = num / 10;
        rightDigit = num % 10;
        sumOfDigits = leftDigit + rightDigit;

        System.out.println("Sum: " + sumOfDigits);

    }
}
