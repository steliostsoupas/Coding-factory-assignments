package gr.aueb.cf.ch6;

public class ArraySearchApp {

    public static void main(String[] args) {
        final int SECRET = 12;
        int[] arr = {1, 5, 9, 3, 12};
        int position = 1;
        boolean secretFound = false;

//        for (int item : arr) {
//            if (item == SECRET) {
//                secretFound = true;
//                break;
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            if (SECRET == arr[i]) {
                secretFound = true;
                break;
            }
            position++;
        }

        if (secretFound) {
            System.out.println("Secret Key was found at " + position + " position");
        } else {
            System.out.println("Secret key was not found");
        }
    }
}
