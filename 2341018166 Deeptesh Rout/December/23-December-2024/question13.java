/*Write a program to find a sub-array whose sum is equal to a given number. */


public class question13 {

    // Function to find a subarray whose sum is equal to the given number
    public static boolean findSubarrayWithSum(int[] arr, int targetSum) {
        // Traverse through all possible subarrays
        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;

            // Calculate sum of subarrays starting from index 'start'
            for (int end = start; end < arr.length; end++) {
                currentSum += arr[end];

                // Check if the current sum is equal to the target sum
                if (currentSum == targetSum) {
                    System.out.println("Subarray found from index " + start + " to " + end);
                    return true;
                }
            }
        }
        System.out.println("No subarray found with the given sum.");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;

        findSubarrayWithSum(arr, targetSum);
    }
}
