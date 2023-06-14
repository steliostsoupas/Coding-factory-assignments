package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * αποφασιζει αν ενας int ειναι
 * αρτιος ή περιττος.
 */

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean isNumEven = false;

        System.out.println("Please insert num (int) to check if its Even or Odd");
        num = in.nextInt();

        isNumEven = isEven(num);

        if (isNumEven = true) {
            System.out.printf("%d is Odd", num);
        } else {
            System.out.printf("%d is Even", num);
        }

    }

    public static boolean isEven(int n) {
        return n % 2 == 0;

//        if (n % 2 != 0) {
//            return true;
//        } else {
//            return false;
//        }
    }
}

