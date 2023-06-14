package gr.aueb.cf.ch4;

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;
        int result = 1;

        System.out.println("Please insert base, power");
        a = in.nextInt();
        n = in.nextInt();

        for (int i = 1; i <= n; i++){
            result *= a;
        }

        if (result <= 2147483647 && result > 0 ){
            System.out.printf("%d^%d = %d",a, n, result);
            System.exit(1);
        }

        System.out.println("Result is so big");
    }
}
