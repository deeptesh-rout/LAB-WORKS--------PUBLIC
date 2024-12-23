public class question8 {

    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            // Extract the last digit
            int digit = number % 10;

            // Check for overflow/underflow before adding the digit
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                throw new ArithmeticException("Overflow occurred during reversal.");
            }

            // Add the digit to the reversed number
            reversed = reversed * 10 + digit;

            // Remove the last digit from the number
            number /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int input = -245; // Example input
        System.out.println("Original number: " + input);
        System.out.println("Reversed number: " + reverse(input));
    }
}
