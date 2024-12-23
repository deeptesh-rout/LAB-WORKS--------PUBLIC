public class question15 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

    public static void main(String[] args) {
        int count = 0; // To count prime numbers
        int number = 2; // Start checking from the number 2

        while (count < 100) { // Keep going until we find the 100th prime
            if (isPrime(number)) {
                count++; // If it's prime, increment the count
            }
            number++; // Move to the next number
        }

        // Output the 100th prime number
        System.out.println("The 100th prime number is: " + (number - 1));
    }
}
