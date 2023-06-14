package gr.aueb.cf.ch3;
/** υπολογιζει το n!
 *
 */

import java.util.Scanner;

public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = 0;
        long mul = 1L;

        System.out.println("Give me a number");
        n = in.nextInt();

        while(i <= n){
            mul *= i;
            i++;
        }
        System.out.println(mul);
    }
}
