import java.util.Scanner;

public class question10 {

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Read two float numbers from the user
        System.out.print("Enter the first float number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter the second float number: ");
        float num2 = scanner.nextFloat();

        // Define epsilon (threshold)
        final float EPSILON = 0.0001f; // Example: very small value less than 1

        // Calculate the absolute difference
        float difference = Math.abs(num1 - num2);

        // Check if the difference is less than epsilon
        if (difference < EPSILON) {
            System.out.println("The difference between the two numbers is less than " + EPSILON);
        } else {
            System.out.println("The difference between the two numbers is greater than or equal to " + EPSILON);
        }

        // Close the scanner
        scanner.close();
    }
}
