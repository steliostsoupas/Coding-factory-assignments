package gr.aueb.cf.ch3;

import java.util.Scanner;

/** αποφασιζει αν πρεπει να
 * αναψουν τα φωτα ενος αυτοκινητου
 * με βαση τρεις μεταβλητες
 * αν βρεχει και ταυτοχρονα ισχυει ενα τουλαχιστον
 * απο τα επομενα: ειναι σκοταδι ή τρεχουμε(>100)
 * τις τιμες τις λαμβανουμε απο τον χρηστη.
 */

public class LightsOnApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean lightsOn = false;
        boolean isRunning = false;
        boolean isRaining = false;
        int speed = 0;
        boolean dark = false;

        System.out.println("Please insert if it is raining(true/false): ");
        isRaining = in.nextBoolean();

        System.out.println("Please insert the speed (int): ");
        speed = in.nextInt();

        System.out.println("Please insert if it is dark(true/false): ");
        dark = in.nextBoolean();

        isRunning = (speed > 100);
        lightsOn = isRaining && (isRunning || dark);

        System.out.println("You need to turn lights on: " + lightsOn );
    }
}
