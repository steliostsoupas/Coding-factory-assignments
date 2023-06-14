package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BooleanBingo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 11;
        boolean bingo = false;

        do{
            System.out.print("Please provide a secret num: ");
            num = in.nextInt();

            if (num != SECRET) {
                System.out.println("Try Again");
                continue;
            }

            System.out.println("BINGO");
            bingo = true;
        }   while (!bingo);
    }
}