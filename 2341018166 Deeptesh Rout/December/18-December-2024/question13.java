import java.util.Scanner;

public class question13 {

    public static void countDigitFrequency(int number) {
        // Create an array to store frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Handle negative numbers by converting to positive
        number = Math.abs(number);

        // Process each digit of the number
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            frequency[digit]++;      // Increment the frequency of that digit
            number /= 10;            // Remove the last digit
        }

        // Output the frequency of each digit
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Read an integer number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the method to count the digit frequency
        countDigitFrequency(number);

        // Close the scanner
        scanner.close();
    }
}


/*import java.util.Scanner;

public class Question13 {

    public static void countDigitFrequency(int number) {
        int[] frequency = new int[10];
        number = Math.abs(number);

        while (number > 0) {
            frequency[number % 10]++; // Increment frequency of the last digit
            number /= 10; // Remove the last digit
        }

        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) System.out.println("Digit " + i + ": " + frequency[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        countDigitFrequency(scanner.nextInt());
        scanner.close();
    }
}
 */