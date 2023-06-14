package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * υλοποιει εναν απλο calculator που παρεχει τις υπηρεσιες odd,sub, div, mod.
 * εμφανιζει ενα μενου προς τον χρηστη με επιλογες, λαμβανει την τιμη της επιλογης και στην συνεχεια δυο ακομα
 * τιμες των num1, num2. τελικα εμφανιζει το αποτελεσμα
 */

public class CalculatorApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int result;
        do {
            printMenu();
            choice = getNextInt("Please insert your choice");

            if (isChoiceInvalid(choice)) {
                System.out.println("Choice is invalid");
                continue;
            }

            if (isChoiceQuit(choice)) {
                System.out.println("Quitting");
                break;
            }
            result = onChoiceGetResult(choice);
            System.out.println("Result = " + result);
            System.out.println();
        } while (true);
    }

    public static void printMenu() {
        System.out.println("Παρακαλώ επιλεξτε ενα απο τα παρακατω:");
        System.out.println("1.Προσθεση");
        System.out.println("2.Αφαιρεση");
        System.out.println("3.Πολλαπλασιασμος");
        System.out.println("4.Διαίρεση");
        System.out.println("5.Υπολοιπο");
        System.out.println("6.Έξοδο\n");
    }

    public static int getNextInt(String message) {
        System.out.println(message);
        return in.nextInt();
    }

    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        int value;
        if (num2 == 0) {
            value = Integer.MAX_VALUE;
        } else {
            value = num1 % num2;
        }
        return value;
    }

    public static int onChoiceGetResult(int choice) {
        int num1 = getNextInt("Please insert the first number(int)");
        int num2 = getNextInt("Please insert the second number(int)");
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
            default:
                break;
        }

        return result;
    }
}
