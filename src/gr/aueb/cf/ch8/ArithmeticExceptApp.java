package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1;
        int num2;
        int result;

        System.out.println("Please insert");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num2 == 0) {
            System.out.println("please");
            System.exit(1);
        }

        result = num1 / num2;
    }
}
