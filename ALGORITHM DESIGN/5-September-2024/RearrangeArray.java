import java.util.*;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5, 6, 7 };
        Arrays.sort(input);
        int[] output = rearrangeArray(input);

        // Print the output array
        for (int num : output) {
            System.out.print(num + " ");
        }
    }

    public static int[] rearrangeArray(int[] input) {
        int n = input.length;
        int[] output = new int[n];

        int start = 0;
        int end = n - 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                output[i] = input[end--];
            } else {
                output[i] = input[start++];
            }
        }

        return output;
    }
}
