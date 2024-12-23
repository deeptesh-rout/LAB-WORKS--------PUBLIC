public class question3 {

    public static int swapBits(int number, int i, int j) {
        // Extract the i-th and j-th bits
        int bit1 = (number >> i) & 1; 
        int bit2 = (number >> j) & 1; 
        
        // If the bits are the same, no need to swap
        if (bit1 == bit2) {
            return number;
        }

        // Create a bitmask with the i-th and j-th bits set
        int bitMask = (1 << i) | (1 << j);

        // Toggle the i-th and j-th bits using XOR
        return number ^ bitMask;
    }

    public static void main(String[] args) {
        int number = 73; // Example number (binary: 1001001)
        int i = 1;       // Position of first bit (0-based indexing)
        int j = 6;       // Position of second bit (0-based indexing)

        System.out.println("Original number: " + number + " (Binary: " + Integer.toBinaryString(number) + ")");
        int result = swapBits(number, i, j);
        System.out.println("After swapping: " + result + " (Binary: " + Integer.toBinaryString(result) + ")");
    }
}
