package gr.aueb.cf.ch6;

public class MissingArrayElement {

    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2};

        System.out.println(getMissing(arr));
    }

    public static int getMissing(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        return sum;
    }
}
