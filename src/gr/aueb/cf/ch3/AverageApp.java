package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * βρισκει το μεσο ορο της βαθμολογιας ενος μαθητη
 * παρεχονται τα τοταλ και καουντ.
 */

public class AverageApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int average = 0;

        System.out.println("Please provide total and count");
        total = in.nextInt();
        count = in.nextInt();

//        if ((total > 0 && count > 0) && (total/count <= 10 )){
//            average = total / count;
//            System.out.println("Average: " + average);}
        if (count == 0){
            System.out.println("Invalid count");
            System.exit(1);
        }
        if (total == 0){
            System.out.println("Invalid total");
            System.exit(1);
        }

        average = total / count;

        if (average > 10){
            System.out.println("Invalid average");
            System.exit(1);
        }

        System.out.println("Average is: " + average);
    }
}
