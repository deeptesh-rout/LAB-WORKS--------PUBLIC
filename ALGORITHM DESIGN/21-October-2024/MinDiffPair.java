import java.util.Arrays;

public class MinDiffPair {
    public static void main(String[] args) {
        int[] arr = { 3, 44, 11, 67, 56, 54 };
        findMinDiffPair(arr);
    }

    public static void findMinDiffPair(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }

        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
                num1 = arr[i - 1];
                num2 = arr[i];
            }
        }

        System.out.println("The pair with the minimum difference is (" + num1 + ", " + num2 + ") with a difference of " + minDiff);
    }
}
