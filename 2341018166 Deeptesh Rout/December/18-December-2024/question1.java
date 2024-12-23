public class question1 {

    // Function to count the number of 1 bits in an integer
    public static int countSetBits(int number) {
        int count = 0;
        while (number != 0) {
            count += number & 1; // Increment count if the last bit is 1
            number >>>= 1;       // Unsigned right shift
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage
        int number = 29; // Binary representation: 11101
        int result = countSetBits(number);

        System.out.println("The number of 1 bits in " + number + " is: " + result);
    }
}
