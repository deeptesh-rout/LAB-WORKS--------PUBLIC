public class question9 {

    public static boolean isPalindrome(int number) {
        // Negative numbers are not palindromes
        if (number < 0) {
            return false;
        }

        int original = number; // Store the original number
        int reversed = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;

            // Check for overflow
            if (reversed > Integer.MAX_VALUE / 10) {
                return false; // Overflow indicates it's not a valid palindrome
            }

            reversed = reversed * 10 + digit;
            number /= 10;
        }

        // Check if the reversed number equals the original
        return original == reversed;
    }

    public static void main(String[] args) {
        int input = 121; // Example input
        System.out.println("Is " + input + " a palindrome? " + isPalindrome(input));

        int input2 = -121; // Another example input
        System.out.println("Is " + input2 + " a palindrome? " + isPalindrome(input2));
    }
}
