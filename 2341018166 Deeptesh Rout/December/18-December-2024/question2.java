import java.util.Scanner;

public class question2 {
    // Method to calculate the parity of a number
    public static int calculateParity(int number) {
        int count = 0;

        // Count the number of 1s in the binary representation
        while (number != 0) {
            count += number & 1; // Add 1 if the least significant bit is 1
            number >>= 1;        // Right shift the number by 1 bit
        }

        // Return 1 if the count is odd, 0 otherwise
        return count % 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the integer from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate the parity
        int parity = calculateParity(number);

        // Output the result
        System.out.println("The parity of the number is: " + parity);

        scanner.close();
    }
}
