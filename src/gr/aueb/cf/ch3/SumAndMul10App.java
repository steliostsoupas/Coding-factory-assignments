package gr.aueb.cf.ch3;

/** υπολογιζει το αθρμοισμα και
 *  μετα το γινομενα των 10 πρωτων
 * ακεραιων.
 */

public class SumAndMul10App {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int mul = 1;

        while (i <= 10){
            sum += i;
            mul *= i;
            i++;
        }

        System.out.println("Sum: " + sum);

        System.out.println("Mul: " + mul);
    }
}
