import java.util.Scanner;


/*Write a program to remove duplicate elements from an array. */
public class question11 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
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

        // Remove duplicates
        int[] uniqueArray = removeDuplicates(array, size);

        // Output the unique elements
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }

    // Method to remove duplicates
    public static int[] removeDuplicates(int[] array, int size) {
        int[] temp = new int[size];
        int newIndex = 0;

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;

            // Check if the current element already exists in the temp array
            for (int j = 0; j < newIndex; j++) {
                if (array[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to the temp array
            if (!isDuplicate) {
                temp[newIndex] = array[i];
                newIndex++;
            }
        }

        // Create a new array of the correct size and copy elements
        int[] uniqueArray = new int[newIndex];
        for (int i = 0; i < newIndex; i++) {
            uniqueArray[i] = temp[i];
        }

        return uniqueArray;
    }
}
