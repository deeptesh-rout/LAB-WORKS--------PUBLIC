public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = findMaxSubarraySum(array);
        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static int findMaxSubarraySum(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array should not be null or empty.");
        }

        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }

        return maxGlobal;
    }
}
