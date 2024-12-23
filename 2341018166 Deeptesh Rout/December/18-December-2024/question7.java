public class question7 {

    public static long power(int x, int y) {
        if (y < 0) {
            throw new IllegalArgumentException("Negative powers are not supported.");
        }
        
        long result = 1;
        long base = x;

        // Perform exponentiation using bitwise operations
        while (y > 0) {
            // If the current bit of y is 1, multiply result by base
            if ((y & 1) == 1) {
                result *= base;
            }

            // Square the base and shift y to the right
            base *= base;
            y >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        int x = 3; // Base
        int y = 4; // Exponent

        System.out.println(x + " raised to the power " + y + " is: " + power(x, y));
    }
}
