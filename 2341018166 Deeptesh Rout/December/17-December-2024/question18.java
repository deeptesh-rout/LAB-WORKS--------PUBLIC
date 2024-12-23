import java.util.Arrays;
import java.util.Scanner;

public class question18 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input: Array elements
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input: Value of K
        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();

        // Check if K is valid
        if (k > size || k <= 0) {
            System.out.println("Invalid value of K. It should be between 1 and " + size);
            return;
        }

        // Sort the array
        Arrays.sort(array);

        // Find K-th smallest and K-th largest
        int kthSmallest = array[k - 1];
        int kthLargest = array[size - k];

        // Output the results
        System.out.println("K-th smallest element: " + kthSmallest);
        System.out.println("K-th largest element: " + kthLargest);

        scanner.close();
    }
}
