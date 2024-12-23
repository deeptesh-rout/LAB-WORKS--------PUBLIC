import java.util.Scanner;
public class question19 {
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

        // Reverse the array using a while loop
        int left = 0;
        int right = size - 1;
        while (left < right) {
            // Swap elements at left and right indices
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the indices towards each other
            left++;
            right--;
        }

        // Output: Reversed array
        System.out.println("Reversed array:");
        for (int element : array) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}
