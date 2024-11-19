import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is larger than array length
        reverse(nums, 0, n - 1);    // Step 1: Reverse the entire array
        reverse(nums, 0, k - 1);    // Step 2: Reverse the first k elements
        reverse(nums, k, n - 1);    // Step 3: Reverse the remaining elements
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        System.out.println("Original array: " + Arrays.toString(nums));
        rotate(nums, k);
        System.out.println("Array after rotation: " + Arrays.toString(nums));
    }
}
