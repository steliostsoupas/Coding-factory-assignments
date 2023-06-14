package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntPowerApp {

    public static void main(String[] args) {
        int a;
        int n;
        BigInteger result = new BigInteger("1");
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert base, power");
        a = in.nextInt();
        n = in.nextInt();

        for (int i = 1; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(a));
        }
        System.out.printf("%d^%d = %,d",a, n, result);
    }
}
