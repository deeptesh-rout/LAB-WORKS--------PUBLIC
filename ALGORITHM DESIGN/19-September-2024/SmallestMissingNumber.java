import java.util.Arrays;
public class SmallestMissingNumber {
    public static int findSmallestMissingNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                return arr[i] + 1; 
            }
        }
        return arr[arr.length - 1] + 1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6 }; 
        int smallestMissingNumber = findSmallestMissingNumber(arr);
        System.out.println("Smallest missing number: " + smallestMissingNumber);
    }
}