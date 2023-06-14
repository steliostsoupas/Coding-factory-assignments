package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * λαμβανει 3 τιμες απο τον χρηστη, τις
 * a, b, c οπου α ειναι υποτεινουσα και β,c οι δυο πλευρες.
 * ελενχει αν το τριγωνο ειναι ορθογωνιο δηλαδη a^2 = b^2 + c^2
 */

public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        final double EPSILON= 0.0005;
        boolean isRight = false;

        System.out.println("");



        if (Math.abs(a * a - (b * b + c * c )) <= EPSILON) {
            System.out.println("ITS RIGHT");
        } else {
            System.out.println("ITS NOT RIGHT");
        }
    }
}
