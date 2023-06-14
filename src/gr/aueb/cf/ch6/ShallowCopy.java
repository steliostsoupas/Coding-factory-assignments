package gr.aueb.cf.ch6;

/**
 * Makes a copy of an array.
 */

public class ShallowCopy {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[arr1.length];

        //αντιγραφη αναφορων shallow copy
//        arr2 = arr1;
//
//        arr2[0] = 222;

        for (int item : arr1) System.out.print(item + " ");
        System.out.println();
        for (int item : arr2) System.out.print(item + " ");
        System.out.println();

        for (int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }

        for (int item : arr1) System.out.print(item + " ");
        System.out.println();
        for (int item : arr2) System.out.print(item + " ");
    }
}
