import java.util.Scanner;

public class question12 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the number of positions to rotate
        System.out.print("Enter the number of positions to rotate left: ");
        int positions = scanner.nextInt();

        // Perform left rotation using recursion
        positions = positions % size; // Handle cases where positions > size
        rotateArrayLeft(array, positions, 0);

        // Output the rotated array
        System.out.println("Array after left rotation:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    // Recursive method to rotate the array
    public static void rotateArrayLeft(int[] array, int positions, int currentStep) {
        if (currentStep == positions) {
            return; // Base case: Stop when the desired number of rotations is achieved
        }

        // Perform one rotation
        int firstElement = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = firstElement;

        // Recursive call for the next rotation
        rotateArrayLeft(array, positions, currentStep + 1);
    }
}
