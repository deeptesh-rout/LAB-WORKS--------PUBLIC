import java.util.Scanner;

public class question12 {

    public static int createNumber(int num1, int num2) {
        // Extract the first two digits of the first number
        int firstTwoDigits = num1 / (int)Math.pow(10, (int)Math.log10(num1) - 1); // Divide num1 by 10^(number of digits - 2)

        // Extract the last two digits of the second number
        int lastTwoDigits = num2 % 100; // Get the remainder when divided by 100

        // Combine them into a new number
        return firstTwoDigits * 100 + lastTwoDigits;
    }

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Read two integer numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Call the method to create the new number
        int result = createNumber(num1, num2);

        // Output the result
        System.out.println("The new number is: " + result);

        // Close the scanner
        scanner.close();
    }
}
/*import java.util.Scanner;

public class Question12 {

    public static int createNumber(int num1, int num2) {
        int firstTwoDigits = num1 / (int) Math.pow(10, (int) Math.log10(num1) - 1); // First two digits
        return firstTwoDigits * 100 + num2 % 100; // Combine with last two digits of num2
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();

        System.out.println("The new number is: " + createNumber(num1, num2));
        scanner.close();
    }
}
 */