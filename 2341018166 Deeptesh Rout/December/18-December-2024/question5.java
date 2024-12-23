public class question5 {

    public static int multiply(int x, int y) {
        int result = 0; // Initialize result to 0

        // Iterate through all bits of y
        while (y != 0) {
            // If the least significant bit of y is set, add x to the result
            if ((y & 1) != 0) {
                result = add(result, x);
            }

            // Shift x to the left (equivalent to multiplying by 2)
            x <<= 1;

            // Shift y to the right (equivalent to dividing by 2)
            y >>= 1;
        }

        return result;
    }

    // Helper method to add two integers without using the '+' operator
    private static int add(int a, int b) {
        while (b != 0) {
            // Calculate carry
            int carry = a & b;

            // Perform addition without carry
            a = a ^ b;

            // Shift carry left by 1 to add it in the next iteration
            b = carry << 1;
        }
        return a;
    }

    public static void main(String[] args) {
        int x = 7; // Example input
        int y = 3; // Example input

        System.out.println("x: " + x + ", y: " + y);
        System.out.println("x * y: " + multiply(x, y));
    }
}
