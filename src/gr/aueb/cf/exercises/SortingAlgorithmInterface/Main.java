package gr.aueb.cf.exercises.SortingAlgorithmInterface;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 1, 9, 3 };

        SortingAlgorithm bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        System.out.println("BubbleSort: " + Arrays.toString(array));
//
//        SortingAlgorithm mergeSort = new MergeSort();
//        mergeSort.sort(array);
//        System.out.println("MergeSort: " + Arrays.toString(array));
//
//        SortingAlgorithm quickSort = new QuickSort();
//        quickSort.sort(array);
//        System.out.println("QuickSort: " + Arrays.toString(array));
    }
}

