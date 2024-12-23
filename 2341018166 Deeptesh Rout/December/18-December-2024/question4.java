public class question4 {

    public static long reverseBits(long number) {
        long reversed = 0; // Initialize the reversed number
        for (int i = 0; i < 64; i++) {
            // Extract the least significant bit of the number
            long bit = number & 1;

            // Shift the bit to its reversed position and add it to reversed
            reversed = (reversed << 1) | bit;

            // Shift the input number to the right to process the next bit
            number >>= 1;
        }
        return reversed;
    }

    public static void main(String[] args) {
        long input = 0xAAAAAAAAAAAAAAAAL; // Example: alternating 1s and 0s
        System.out.println("Input (Binary): " + Long.toBinaryString(input));
        long output = reverseBits(input);
        System.out.println("Output (Binary): " + Long.toBinaryString(output));
    }
}
