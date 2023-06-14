package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Sorts the elements of an array
 * using the Bubblesort Algorithm.
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {23, 15, 12, 10, 3};

        for ( int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();

        for (int i = arr.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j + 1]){         // > = αυξουσα , < = φθινουσα σειρα στην print.
                    swap(arr, j, j + 1);
                }
            }
        }

        for ( int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();

    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
