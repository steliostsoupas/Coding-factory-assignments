package gr.aueb.cf.ch7;

import java.util.Scanner;

public class EncryptionApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String givenString;
        String EnString;
        String decString;

        givenString = getString();
        EnString = encryptString(givenString);
        System.out.printf("String is encrypted to %s.\n", EnString);
        decString = decryptString(givenString);
        System.out.printf("String is decrypted to %s.\n", decString);
    }

    public static String encryptString(String s) {
        char[] c;
        String EnString = "";

        c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            c[i]++;
        }

        for (char value : c) {
            EnString = EnString.concat(String.valueOf(value));
        }
        return EnString;
    }

    public static String decryptString(String s) {
        StringBuilder decString = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            decString.append(--ch);
        }
        return decString.toString();
    }

    public static String getString() {
        System.out.println("Please provide a string: ");
        return in.nextLine();
    }
}