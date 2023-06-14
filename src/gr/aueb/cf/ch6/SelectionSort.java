package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * array soft with Selection Sort
 */

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 14, 3, 25, 12};

        int minVal;
        int minPosition;
        int tmp;
        for (int item : arr) System.out.print(item + " ");
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {

            // find the min value
            minPosition = i;
            minVal = arr[i];
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < minVal) {
                    minVal = arr[j];
                    minPosition = j;
                }
            }

            // Swap
            tmp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = tmp;

        }

        for (int item : arr) System.out.print(item + " ");

        Arrays.sort(arr);
    }

}
