package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * ενας μικρος βατραχος θελει να περασει ενα ποταμι.
 * 0 βατραχος βρισκετε στην θεση χ και θελει να φτασει στη θεση y
 * ή σε θεση > Y.0 βατραχος κανει jump a fixed distance, D.
 *
 * βρισκει τον ελαχιστο αριθμο jumps που ο βατραχος πρεπει να φτασει
 * τον στοχο.
 */

public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 1;
        int end = 10;
        int jumps = 4;
        int counter = 0;

//        System.out.println("Please give me the start, end, and jumps of frog: ");
//        start = in.nextInt();
//        end = in.nextInt();
//        jumps = in.nextInt();

        counter = (int) Math.ceil((end - start) / (double) jumps);

//        for (int i = start;start < end;start = start + jumps){
//            counter++;
//        }

        System.out.println("Ta elaxista jumps einai " + counter);


    }
}
