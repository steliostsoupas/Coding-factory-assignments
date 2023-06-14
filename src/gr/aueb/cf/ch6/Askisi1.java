package gr.aueb.cf.ch6;

public class Askisi1 {

    public static void main(String[] args) {
        int[] arr = {30, 12, 80, 7, 15};

        int maxPos = getMaxPosition(arr,3,4);
        System.out.println(maxPos);
    }

    private static int getMaxPosition(int[] arr,int low, int high) {
        if (arr == null) return -1;
        if (low < 0  || high  > arr.length -1 || high < low ) return -1;

        int maxPosition = 0;

        for (int i = low; i < high; i++) {
            if (arr[i] > arr[maxPosition]) {
                maxPosition = i + 1;
            }
        }
        return maxPosition;
    }
}
