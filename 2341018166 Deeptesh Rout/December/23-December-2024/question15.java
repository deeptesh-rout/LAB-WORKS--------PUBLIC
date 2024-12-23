public class question15 {

    public static void main(String[] args) {
        // Define two arrays
        int[] array1 = {1, 2, 4, 5, 6};
        int[] array2 = {4, 5, 7, 8, 9};
        
        // Find and print the intersection of the two arrays
        System.out.println("Intersection of the arrays:");
        findIntersection(array1, array2);
    }

    // Function to find the intersection of two arrays
    public static void findIntersection(int[] array1, int[] array2) {
        // Iterate through each element in array1
        for (int i = 0; i < array1.length; i++) {
            // For each element in array1, check if it exists in array2
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break; // Break to avoid duplicates
                }
            }
        }
    }
}
/* */

/*Write a program to find the intersection of two arrays (common elements). */