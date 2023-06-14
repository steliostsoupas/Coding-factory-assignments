package gr.aueb.cf.ch6;

/**
 * Δηλωση, αρχικοποιηση πινακα και populate(εισαγωγη στοιχειων)
 */

public class PopulateArray {

    public static void main(String[] args) {

        // Δηλωση και αρχικοποιηση πινακα με lenght
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //enchanced for
        for (int item : arr) System.out.print(item + " ");


        // unsized initialization
        int[]arr2 = {1, 5, 8, 9, 12};


        // Array initializer
        int[] arr3;
        arr3 = new int []{4, 6, 9, 10};

        int[] arr4 = new int []{4, 6, 9, 10};

    }
}
