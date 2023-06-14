package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * υπολογιζει το α^n
 */

public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int result = 1;

        System.out.println("Please insert a, b");
        a = in.nextInt();
        b = in.nextInt();

        result = pow(a,b);
        System.out.printf("%d^%d = %d",a, b, result);
    }

    public static int pow(int a,int n) {
        int power = 1;
        for (int i = 1; i <= n;i++) {
            power *= a;
        }
        return power;
    }
}
