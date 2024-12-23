
import java.util.Scanner;

public class question17 {
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

        // Initialize min and max
        int min = array[0];
        int max = array[0];

        // Traverse the array to find min and max
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Output the results
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

        scanner.close();
    }
}
