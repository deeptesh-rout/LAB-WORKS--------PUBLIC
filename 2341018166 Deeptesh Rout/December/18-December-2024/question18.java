import java.util.Scanner;

public class question18 {

    // Method to check if a number is even
    public static boolean isEven(int number) {
        // Return true if the number is divisible by 2, otherwise return false
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Read an integer number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the method to check if the number is even and print the result
        System.out.println(isEven(number));

        // Close the scanner
        scanner.close();
    }
}
