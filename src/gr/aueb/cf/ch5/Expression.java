package gr.aueb.cf.ch5;

/**
 * float double expressions
 */

public class Expression {

    public static void main(String[] args) {
        double num1 = 1200.5;
        double num2 = 2.0;
        double result = 0.0;
        double mod = 0.0;

        result = num1 / num2;
        mod = num1 % num2;

        System.out.printf("%,.2f / %.2f = %,.2f", num1 , num2 , result);
        System.out.println("");
        System.out.printf("%.2f %%  %.2f = %.2f", num1, num2, mod);
    }

}
