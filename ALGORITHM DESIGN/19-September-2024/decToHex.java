
/*USING BUILT IN FUNCTION */

public class decToHex {
    public static void main(String[] args) {
        
        int dec = 14;

        String str = Integer.toHexString(dec);

        System.out.println(str);
    }
}


/*USING RECURSION */


/*public class DecimalToHexadecimal {

    // Recursive method to convert decimal to hexadecimal
    public static String decimalToHex(int decimal) {
        // Base case: if the decimal is 0, return an empty string
        if (decimal == 0) {
            return "";
        }

        // Recursively call the function with the quotient and concatenate the remainder
        int remainder = decimal % 16;
        char hexChar;

        // Convert the remainder to a hexadecimal digit (0-9, A-F)
        if (remainder < 10) {
            hexChar = (char) (remainder + '0');
        } else {
            hexChar = (char) (remainder - 10 + 'A');
        }

        return decimalToHex(decimal / 16) + hexChar;  // Recursion with the quotient
    }

    public static void main(String[] args) {
        int decimalNumber = 255; // Example decimal number
        String hexValue = decimalToHex(decimalNumber);

        // If the number is 0, we need to return "0" as the hexadecimal value
        if (hexValue.isEmpty()) {
            hexValue = "0";
        }

        System.out.println("Decimal: " + decimalNumber + " -> Hexadecimal: " + hexValue);
    }
}
 */