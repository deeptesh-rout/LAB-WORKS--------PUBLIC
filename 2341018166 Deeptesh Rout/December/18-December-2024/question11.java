import java.util.Scanner;

public class question11 {

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Read an integer number from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Handle negative numbers by converting to positive
        number = Math.abs(number);

        int evenCount = 0; // Initialize count of even digits

        // Count even digits
        while (number > 0) {
            int digit = number % 10; // Extract the last digit

            // Check if the digit is even
            if (digit % 2 == 0) {
                evenCount++;
            }

            number /= 10; // Remove the last digit
        }

        // Output the count of even digits
        System.out.println("Number of even digits: " + evenCount);

        // Close the scanner
        scanner.close();
    }
}

/*import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = Math.abs(scanner.nextInt()), evenCount = 0;

        while (number > 0) {
            if ((number % 10) % 2 == 0) evenCount++; // Check if last digit is even
            number /= 10; // Remove the last digit
        }

        System.out.println("Number of even digits: " + evenCount);
        scanner.close();
    }
}
 */
