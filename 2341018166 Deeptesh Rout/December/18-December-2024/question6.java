public class question6 {

    public static int divide(int dividend, int divisor) {
        // Handle edge cases for division by 0
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is undefined.");
        }

        // Handle overflow case when dividing Integer.MIN_VALUE by -1
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Work with positive values for simplicity
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int result = 0;

        // Perform division using bitwise operations
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            int multiple = 1;

            // Shift tempDivisor left until it's greater than absDividend
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            // Subtract tempDivisor from absDividend and add multiple to result
            absDividend -= tempDivisor;
            result += multiple;
        }

        // Apply the sign to the result
        return negative ? -result : result;
    }

    public static void main(String[] args) {
        int dividend = 43; // Example dividend
        int divisor = 5;   // Example divisor

        System.out.println("Dividend: " + dividend + ", Divisor: " + divisor);
        System.out.println("Quotient: " + divide(dividend, divisor));
    }
}
