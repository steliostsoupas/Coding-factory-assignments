package gr.aueb.cf.ch6;

public class Askisi2 {

    public static void main(String[] args) {
        int[] arr = {6, 90, 4, 17};

        int minPosition = 0;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        System.out.println(secondMin);
    }
}
