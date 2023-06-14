package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * κανει bingo οταν ο χρηστης μαντεψει
 * ενα  Secret key
 */

public class BingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 17;

        while (true){
            System.out.print("Please provide a secret num: ");
            num = in.nextInt();

            if (num == SECRET){
                System.out.println("BINGO");
                break;
            } else {
                System.out.println("Try Again");
            }
        }
    }
}
