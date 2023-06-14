package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * ΔΙΑΒΑΖΕΙ ΩΡΕΣ ΛΕΠΤΑ ΔΕΥΤΕΡΑ ΚΑΙ ΤΑ ΜΕΤΑΤΡΕΠΕΙ ΣΕ ΔΕΥΤΕΡΟΛΕΠΤΑ
 */
public class SecondsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = 0;
        int mins = 0;
        int secs = 0;
        int totalSecs = 0;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        System.out.println("Please insert by turn hours, minutes, seconds: ");
        hours = scanner.nextInt();
        mins = scanner.nextInt();
        secs = scanner.nextInt();

        totalSecs = hours * SECONDS_PER_HOUR + mins * SECONDS_PER_MINUTE + secs;

        System.out.printf(Locale.forLanguageTag("en"),"%d hours,%d minutes,%d seconds = %,d total seconds",hours,mins,secs,totalSecs);


    }
}
