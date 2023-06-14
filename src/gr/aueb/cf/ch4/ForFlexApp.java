package gr.aueb.cf.ch4;

//διαβαζουμε απο το stdin το start value end value step
// kai εκτυπωνει το πληθων των επαναληψεων.

import java.util.Scanner;

public class ForFlexApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue = 0;
        int endValue = 0;
        int step;
        int iterations = 0;

        System.out.println("Please provide start,end and step values: ");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue;i <= endValue;i= i + step){
            iterations++;
            System.out.print(i + " ");
        }

        System.out.println("\nIterations: " + iterations);
    }
}
