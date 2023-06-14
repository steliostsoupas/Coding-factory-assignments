package gr.aueb.cf.ch3;

import java.util.Scanner;

/** ενα αεροσκαφος εχει δυο δεξαμενες.
 * αν μια δεξαμενη  εχει λιγοτερο απο 1/4 καυσιμα
 * τοτε αναβει πορτοκαλι σημα
 * ενω αν και οι δυο δεξαμενες εχουν λιγοτερο απο 1/4
 * τοτε αναβει κοκινο σημα.ο πιλοτος-χρηστης δινει true-false
 * αναλογα αν tank < 1/4 ή οχι.
 */

public class OrangeRedSignalApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Insert please if tank 1, tank 2 are less than 1/4");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange On: " + orangeOn );
        System.out.println("Orange On: " + redOn );

    }
}
