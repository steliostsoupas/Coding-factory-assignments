package gr.aueb.cf.ch4;

//prosthetei kai polaplasiazei n πρωτους ακεραιους
// το n το δινει ο χρηστης

import java.util.Scanner;

public class AddMullApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int result = 1;

        System.out.println("Please insert a num(int)");
        n = in.nextInt();

        for (int i = 1; i <= n; i++){
            sum += i;
            result *= i;
        }

        System.out.println("Sum = " + sum);
        System.out.printf("Mull = %,d",result);
    }
}
