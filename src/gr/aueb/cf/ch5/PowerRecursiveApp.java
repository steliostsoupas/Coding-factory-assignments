package gr.aueb.cf.ch5;

/**
 * υπολογιζει το a^n αναδρομικα .
 */

public class PowerRecursiveApp {

    public static void main(String[] args) {
        
        System.out.println(power(5,0));

    }

    public static float power(float a, float n) {
        if (n < 0 ) return 1 / power(a,-n);
        if (n == 0) return 1;
        return a * power(a,n - 1);
    }

}
