package gr.aueb.cf.ch6;

public class MissingArrayElement1 {

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 3, 2, 1};
        setAscending(arr);
        print(arr);
        System.out.println(getMissing(arr));

        }

        public static int getMissing(int[] arr){
            int missing = -1;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] - arr[i + 1] == -2) {
                    missing = arr[i] + 1;
                }
            }
            return missing;
        }

        public static void setAscending ( int[] arr){
            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {         // > = αυξουσα , < = φθινουσα σειρα στην print.
                        swap(arr, j, j + 1);
                    }
                }
            }
        }

        public static void swap ( int[] arr, int i, int j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        public static void print ( int[] arr){
            for (int el : arr) {
                System.out.print(el + " ");
            }

            System.out.println();
    }
}